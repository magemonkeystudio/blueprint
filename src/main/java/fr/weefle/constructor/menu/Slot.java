package fr.weefle.constructor.menu;

import org.bukkit.inventory.ItemStack;

public class Slot {
    protected Integer i = null;
    protected Menu menu;
    protected final ItemStack itemStack;

    public Slot(ItemStack itemStack) { this.itemStack = itemStack; }

    void setMenu(int i, Menu menu) {
        this.i = i;
        this.menu = menu;
    }

    public ItemStack getItemStack() { return itemStack == null ? null : itemStack.clone(); }

    public void onLeftClick() { }

    public void onShiftLeftClick() { onLeftClick(); }

    public void onRightClick() { onLeftClick(); }

    public void onShiftRightClick() { onRightClick(); }

    public void onNumberClick(int numberKey) { onLeftClick(); }

    public void onDoubleClick() { onLeftClick(); }

    public void onDrop() { onLeftClick(); }

    public void onControlDrop() { onDrop(); }

    public void onSwapOffhand() { onLeftClick(); }
}
