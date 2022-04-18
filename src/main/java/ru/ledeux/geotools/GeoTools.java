package ru.ledeux.geotools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.ledeux.geotools.block.*;
import ru.ledeux.geotools.block.entity.DemoBlockEntity;
import ru.ledeux.geotools.item.Ruby;

// Главный класс мода (входная точка)
public class GeoTools implements ModInitializer {

    // Идентификатор мода и его имя
    public static final String MOD_ID = "geotools";
    public static final String MOD_NAME = "GeodesyTools";

    // Создание предметов, блоков и сущностей
    public static final Ruby RUBY = new Ruby(new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    public static final Block TOTAL_STATION =
            new TotalStation(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item TOTAL_STATION_BI =
            new BlockItem(TOTAL_STATION, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    public static final Block REFLECTOR =
            new Reflector(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item REFLECTOR_BI =
            new BlockItem(REFLECTOR, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    public static final Block FORCED_CENTERING_PYLON =
            new ForcedCenteringPylon(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item FORCED_CENTERING_PYLON_BI =
            new BlockItem(FORCED_CENTERING_PYLON, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    public static final Block DEMO_BLOCK =
            new DemoBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item DEMO_BLOCK_BI =
            new BlockItem(DEMO_BLOCK, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));
    public static BlockEntityType<DemoBlockEntity> DEMO_BLOCK_ENTITY;

    public static final Block STATE_TEST =
            new StateTest(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item STATE_TEST_BI =
            new BlockItem(STATE_TEST, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    public static final Block VERTICAL_SLAB_BLOCK =
            new VerticalSlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).nonOpaque());
    public static final Item VERTICAL_SLAB_BLOCK_BI =
            new BlockItem(VERTICAL_SLAB_BLOCK, new FabricItemSettings().group(GeoTools.GEO_TOOLS).maxCount(64));

    // Создание креативной вкладки для предметов мода
    public static final ItemGroup GEO_TOOLS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(TOTAL_STATION_BI));

    // Наследованный метод инициализации зарегистрированных предметов, блоков, сущностей и т.д.
    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "total_station"), TOTAL_STATION);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "total_station"), TOTAL_STATION_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "reflector"), REFLECTOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "reflector"), REFLECTOR_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "forced_centering_pylon"), FORCED_CENTERING_PYLON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "forced_centering_pylon"), FORCED_CENTERING_PYLON_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "demo_block"), DEMO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "demo_block"), DEMO_BLOCK_BI);
        DEMO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "geotools:demo_block_entity",
                FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "state_test"), STATE_TEST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "state_test"), STATE_TEST_BI);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vertical_slab_block"), VERTICAL_SLAB_BLOCK_BI);
    }
}
