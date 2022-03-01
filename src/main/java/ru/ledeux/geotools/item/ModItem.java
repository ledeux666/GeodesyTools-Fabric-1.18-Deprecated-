package ru.ledeux.geotools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import ru.ledeux.geotools.GeoTools;

// Класс содержит созданные экземпляры предметов, которые следует зарегистрировать в классе ModRegister
public class ModItem {

    public static final Ruby RUBY = new Ruby(new FabricItemSettings().group(GeoTools.GEOTOOLS).maxCount(64));
}
