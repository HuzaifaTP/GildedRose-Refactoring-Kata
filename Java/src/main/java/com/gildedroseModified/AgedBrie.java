package com.gildedroseModified;

public class AgedBrie  extends Abstract_Functions_Universal {

    private final Item item;

    public AgedBrie(Item item) {
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
