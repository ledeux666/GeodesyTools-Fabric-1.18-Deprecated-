package ru.ledeux.geotools.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import ru.ledeux.geotools.GeoTools;

// Класс содержит созданные экземпляры блоков, которые следует зарегистрировать в классе ModRegister
public class ModBlock {

    // Создание тахеометра в виде блока и предмета (BlockItems - BI)
    public static final Block TOTAL_STATION = new TotalStation(
            FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item TOTAL_STATION_BI = new BlockItem(
            TOTAL_STATION, new FabricItemSettings().group(GeoTools.GEOTOOLS));

    public static final Block REFLECTOR = new Reflector(
            FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item REFLECTOR_BI = new BlockItem(
            REFLECTOR, new FabricItemSettings().group(GeoTools.GEOTOOLS));

    public static final Block TEST = new Test(
            FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque());
    public static final Item TEST_BI = new BlockItem(
            TEST, new FabricItemSettings().group(GeoTools.GEOTOOLS));
}
