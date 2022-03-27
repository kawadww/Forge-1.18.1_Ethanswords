package com.kawadw.hades.painting;

import com.kawadw.hades.Hades;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Hades.MOD_ID);

    public static final RegistryObject<Motive> SONICOBLUEWHITE =
            PAINTING_MOTIVES.register("sonicobluewhite", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOBLACKPINK =
            PAINTING_MOTIVES.register("sonicoblackpink", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOWHITE =
            PAINTING_MOTIVES.register("sonicowhite", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOMAID =
            PAINTING_MOTIVES.register("sonicomaid", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOWHITEPINK =
            PAINTING_MOTIVES.register("sonicowhitepink", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOCOTTONCANDY =
            PAINTING_MOTIVES.register("sonicocottoncandy", () -> new Motive(144,144));

    public static final RegistryObject<Motive> TRANS =
            PAINTING_MOTIVES.register("trans", () -> new Motive(144,144));

    public static final RegistryObject<Motive> ASUNA =
            PAINTING_MOTIVES.register("asuna", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOKNEEL =
            PAINTING_MOTIVES.register("sonicokneel", () -> new Motive(144,144));

    public static final RegistryObject<Motive> SONICOCHEERLEADER =
            PAINTING_MOTIVES.register("sonicocheerleader", () -> new Motive(144,144));

    public static final RegistryObject<Motive> MIKUBLACK =
            PAINTING_MOTIVES.register("mikublack", () -> new Motive(144,144));

    public static final RegistryObject<Motive> ASTOLFOBLACK =
            PAINTING_MOTIVES.register("astolfoblack", () -> new Motive(144,144));






    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
