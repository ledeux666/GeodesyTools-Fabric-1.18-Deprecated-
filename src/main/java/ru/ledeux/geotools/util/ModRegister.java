package ru.ledeux.geotools.util;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static ru.ledeux.geotools.GeoTools.MOD_ID;
import static ru.ledeux.geotools.block.ModBlock.*;
import static ru.ledeux.geotools.item.ModItem.*;

// Регистрация предметов, блоков, сущностей и т.д.
public class ModRegister {

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
    }

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "total_station"), TOTAL_STATION);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "total_station"), TOTAL_STATION_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "reflector"), REFLECTOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "reflector"), REFLECTOR_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tripod"), TRIPOD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tripod"), TRIPOD_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "forced_centering_pylon"), FORCED_CENTERING_PYLON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "forced_centering_pylon"), FORCED_CENTERING_PYLON_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "test"), DEMO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "test"), DEMO_BLOCK_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK_BI);
    }

    public static void registerBlockEntities() {


    }
}
