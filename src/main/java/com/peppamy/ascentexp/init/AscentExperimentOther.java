package com.peppamy.ascentexp.init;

import com.peppamy.ascentexp.AscentExperiment;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

/**
 * @author SkyNotTheLimit
 */
public interface AscentExperimentOther {
    SimpleParticleType CHARTIUM_FLAME = registerParticle("chartium_flame", FabricParticleTypes.simple(false));

    static <T extends ParticleType<T> & ParticleEffect> T registerParticle(String name, T particleType)
    {
        return Registry.register(Registries.PARTICLE_TYPE, AscentExperiment.id(name), particleType);
    }

    static void init()
    {
        // NO-OP
    }
}
