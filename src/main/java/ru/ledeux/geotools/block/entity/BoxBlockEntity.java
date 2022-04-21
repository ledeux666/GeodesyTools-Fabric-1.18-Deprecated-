package ru.ledeux.geotools.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import ru.ledeux.geotools.GeoTools;
import ru.ledeux.geotools.screen.BoxScreenHandler;
import ru.ledeux.geotools.util.ImplementedInventory;

public class BoxBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    // Создание пустого инвентаря.
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);

    public BoxBlockEntity(BlockPos pos, BlockState state) {
        super(GeoTools.BOX_BLOCK_ENTITY, pos, state);
    }

    // Метод из интерфейса ImplementedInventory.
    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    // Методы ниже наследованы из интерфейса NamedScreenHandlerFactory.
    // createMenu создает ScreenHandler.
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        // Мы предоставляем *this* (BoxBlockEntity) экранному обработчику так как наш класс имплементирует Inventory.
        // Только сервер имеет Inventory в начале. Он будет синхронизирован с клиентом в ScreenHandler.
        return new BoxScreenHandler(syncId, playerInventory, this);
    }

    // getDisplayName предоставляет свое имя, которое обычно показано сверху.
    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    // Десериализация (чтение) данных из nbt.
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    // Сериализация (запись) данных в nbt.
    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
    }
}