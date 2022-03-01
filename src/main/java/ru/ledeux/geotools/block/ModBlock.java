package ru.ledeux.geotools.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import ru.ledeux.geotools.GeoTools;

// Класс содержит созданные экземпляры блоков, которые следует зарегистрировать в классе ModRegister
public class ModBlock {

    // Создание тахеометра в виде блока и предмета (BlockItems - BI)
    public static final TotalStation TOTAL_STATION = new TotalStation(
            FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final BlockItem TOTAL_STATION_BI = new BlockItem(
            TOTAL_STATION, new FabricItemSettings().group(GeoTools.GEOTOOLS));

    public static final Reflector REFLECTOR = new Reflector(
            FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final BlockItem REFLECTOR_BI = new BlockItem(
            REFLECTOR, new FabricItemSettings().group(GeoTools.GEOTOOLS));
}
