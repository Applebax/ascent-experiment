package com.peppamy.ascentexp.mixin;

import com.peppamy.ascentexp.entity.RunFromBlockGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({CreeperEntity.class, AbstractSkeletonEntity.class})
public abstract class CreeperEntity_AbstractSkeletonEntityMixin extends HostileEntity {
    protected CreeperEntity_AbstractSkeletonEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "initGoals", at = @At("HEAD"))
    private void injectScaredOfChartiumTorchGoal(CallbackInfo ci) {
        this.goalSelector.add(3, RunFromBlockGoal.createRunFromChartiumTorchGoal(this));
    }
}
