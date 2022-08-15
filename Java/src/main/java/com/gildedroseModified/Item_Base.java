package com.gildedroseModified;

public class Item_Base extends Abstract_Functions_Universal {

    private final Item item;

    public Item_Base(Item item) {
        this.item = item;
    }

    @Override
    public void updateQualityManually() {
        decreaseQuality(item);
        decrementSellIn(item);
        if (hasExpired(item)) {
            decreaseQuality(item);
        }
    }
}
