package com.gildedroseModified;

public class BackStagePasses extends Abstract_Functions_Universal {

    private final Item item;

    public BackStagePasses(Item item) {
        this.item = item;
    }

    @Override
    public void updateQualityManually() {
        ageWell(item);
        decrementSellIn(item);
        if (hasExpired(item)) {
            item.quality = 0;
        }
    }

    private void ageWell(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                incrementQuality(item);
            }
            if (item.sellIn < 6) {
                incrementQuality(item);
            }
        }
    }
}
