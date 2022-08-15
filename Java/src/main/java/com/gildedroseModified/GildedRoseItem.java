package com.gildedroseModified;

public interface GildedRoseItem {

    static GildedRoseItem gildedRoseItem(Item item) {
        if (item.name.equals(Item_Match_And_Update.AGED_BRIE)) {
            return new AgedBrie(item);
        }
        if (item.name.equals(Item_Match_And_Update.BACKSTAGE_PASSES)) {
            return new BackStagePasses(item);
        }
        if (item.name.equals(Item_Match_And_Update.LEGENDARY)) {
            return new Legendary();
        }
        if (item.name.equals(Item_Match_And_Update.CONJURED)) {
            return new Conjured(item);
        }
        return new Item_Base(item);
    }

    void updateQualityManually();

}
