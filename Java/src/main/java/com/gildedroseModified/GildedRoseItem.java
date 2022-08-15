package com.gildedroseModified;

public interface GildedRoseItem {

String AGED_BRIE = "Aged Brie";
String LEGENDARY = "Sulfuras, Hand of Ragnaros";
String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
String CONJURED = "Conjured Mana Cake";


    static GildedRoseItem gildedRoseItem(Item item) {
        if (item.name.equals(AGED_BRIE)) {
            return new AgedBrie(item);
        }
        if (item.name.equals(BACKSTAGE_PASSES)) {
            return new BackStagePasses(item);
        }
        if (item.name.equals(LEGENDARY)) {
            return new Legendary();
        }
        if (item.name.equals(CONJURED)) {
            return new Conjured(item);
        }
        return new Item_Base(item);
    }

    void updateQualityManually();

}
