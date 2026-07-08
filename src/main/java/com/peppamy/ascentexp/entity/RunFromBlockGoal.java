package com.peppamy.ascentexp.entity;

import com.peppamy.ascentexp.AscentExperiment;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.NoPenaltyTargeting;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class RunFromBlockGoal extends Goal {
    protected final PathAwareEntity mob;
    protected final Predicate<BlockState> scaryBlockTest;
    protected final int runDistance;
    private final double fastRunSpeed;
    private final double slowRunSpeed;

    @Nullable
    protected Vec3d scaryBlockPos;
    @Nullable
    protected Path runPath;

    public RunFromBlockGoal(PathAwareEntity mob, Predicate<BlockState> scaryBlockTest, int runDistance, double fastRunSpeed, double slowRunSpeed) {
        this.mob = mob;
        this.scaryBlockTest = scaryBlockTest;
        this.runDistance = runDistance;
        this.fastRunSpeed = fastRunSpeed;
        this.slowRunSpeed = slowRunSpeed;
    }

    @Override
    public boolean canStart() {
        this.scaryBlockPos = BlockPos.findClosest(mob.getBlockPos(), this.runDistance, 4,
                                                  pos -> this.mob.getWorld().testBlockState(pos, this.scaryBlockTest))
                                     .map(BlockPos::toBottomCenterPos)
                                     .orElse(null);
        if (this.scaryBlockPos == null)
            return false; // no scary block nearby

        // the pos where i want to run to because it's away from the scary block and safe there
        Vec3d runToPos = NoPenaltyTargeting.findFrom(this.mob, 16, 7, scaryBlockPos);
        if (runToPos == null)
            return false; // no valid safe place exists

        if (runToPos.squaredDistanceTo(scaryBlockPos) < this.mob.squaredDistanceTo(scaryBlockPos))
            return false; // already close enough to safe space

        this.runPath = this.mob.getNavigation().findPathTo(runToPos.x, runToPos.y, runToPos.z, 0);
        return this.runPath != null;
    }


    @Override
    public boolean shouldContinue() {
        return !this.mob.getNavigation().isIdle();
    }

    @Override
    public void start() {
        this.mob.getNavigation().startMovingAlong(this.runPath, this.slowRunSpeed);
    }

    @Override
    public void stop() {
        this.scaryBlockPos = null;
    }

    @Override
    public void tick() {
        this.mob.getNavigation().setSpeed( // fast if within seven blocks from scary block
            this.mob.squaredDistanceTo(this.scaryBlockPos) < (7 * 7) ? this.fastRunSpeed : this.slowRunSpeed);
        this.mob.setTarget(null); // ignore the player/other target if im scared
    }

    public static RunFromBlockGoal createRunFromChartiumTorchGoal(PathAwareEntity mob) {
        return new RunFromBlockGoal(
            mob,
            state -> state.isIn(AscentExperiment.CHARTIUM_TORCHES),
            8,
            1.2, 1.0);
    }
}
