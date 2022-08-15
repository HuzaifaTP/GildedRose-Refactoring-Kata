package com.gildedroseModified;
import static com.gildedroseModified.GildedRoseItem.gildedRoseItem;

public class Item_Match_And_Update {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String LEGENDARY = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String CONJURED = "Conjured Mana Cake";

    private Item[] items;

    public Item_Match_And_Update(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            gildedRoseItem(item).updateQualityManually();
        }
    }
}
