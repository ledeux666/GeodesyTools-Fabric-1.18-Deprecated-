package ru.ledeux.geotools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.ledeux.geotools.block.entity.DemoBlockEntity;
import ru.ledeux.geotools.util.ModRegister;

import static ru.ledeux.geotools.block.ModBlock.DEMO_BLOCK;
import static ru.ledeux.geotools.block.ModBlock.REFLECTOR;

// Чтобы добавить дополнительное поведение предмету, необходимо сделать собственный класс предмета.

// Главный класс мода (входная точка)
public class GeoTools implements ModInitializer {

    // Идентификатор мода и его имя
    public static final String MOD_ID = "geotools";
    public static final String MOD_NAME = "GeodesyTools";

    // Создание креативной вкладки для предметов мода
    public static final ItemGroup GEOTOOLS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(REFLECTOR));

    // Наследованный метод инициализации зарегистрированных предметов, блоков, сущностей и т.д.
    @Override
    public void onInitialize() {

        ModRegister.registerItems();
        ModRegister.registerBlocks();
    }
}
