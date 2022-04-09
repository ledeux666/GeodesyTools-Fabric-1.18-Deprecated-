package ru.ledeux.geotools.util;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.ledeux.geotools.block.entity.DemoBlockEntity;

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

        // Для регистрации BlockEntity используется перегруженный метод регистрации Registry.register в котором его
        // ID задается строкой, а не при помощи класса Identifier
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "demo_block"), DEMO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "demo_block"), DEMO_BLOCK_BI);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, "geotools:demo_block_entity",
                FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "state_test"), STATE_TEST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "state_test"), STATE_TEST_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK_BI);
    }
}
