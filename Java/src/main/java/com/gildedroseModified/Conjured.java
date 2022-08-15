package com.gildedroseModified;

public class Conjured extends Item_Base {
    public Conjured(Item item) {
        super(item);
    }

    @Override
    void decreaseQuality(Item item) {
        super.decreaseQuality(item);
        super.decreaseQuality(item);
    }
}
