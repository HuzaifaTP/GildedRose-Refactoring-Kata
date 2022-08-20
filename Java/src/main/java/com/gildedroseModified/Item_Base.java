package com.gildedroseModified;

public class Item_Base extends Update_Patterns_Dictionary {

    private final Item item;

    public Item_Base(Item item) {
        this.item = item;
    }

    @Override
    public void updateQualityManually() {
        BaseItemUpdatePattern(item);
    }
}
