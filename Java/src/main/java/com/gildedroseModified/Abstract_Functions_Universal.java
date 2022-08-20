package com.gildedroseModified;

public abstract class Abstract_Functions_Universal{

    boolean hasExpired(Item item) {
    return item.sellIn < 0;
    }

    void increaseQuality(Item item) {
    if (item.quality < 50) {
    item.quality = item.quality + 1;
    }
    }

    void decreaseQuality(Item item) {
    if (item.quality > 0) {
    item.quality = item.quality - 1;
    }
    }

    void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

}
