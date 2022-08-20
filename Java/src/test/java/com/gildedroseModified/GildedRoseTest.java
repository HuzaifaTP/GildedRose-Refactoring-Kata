package com.gildedroseModified;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void testAgedBrieUpdatePattern() {
        Item item = new Item(GildedRoseItem.AGED_BRIE, 12, 3);

        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(4, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(5, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(6, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(7, item.quality);
    }

    @Test
    public void testConjuredItemUpdatePattern(){
        Item item = new Item(GildedRoseItem.CONJURED, 3, 6);

        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(4, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(2, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(0, item.quality);
    }

    @Test
    public void testBackStageItemUpdatePattern(){
        Item item = new Item(GildedRoseItem.BACKSTAGE_PASSES, 11, 0);

        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(1, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(3, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(5, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(7, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(9, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(11, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(14, item.quality);
    }

    @Test
    public void testLegendaryItemUpdatePattern(){
        Item item = new Item(GildedRoseItem.LEGENDARY, 2, 0);

        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(0, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(0, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(0, item.quality);
        GildedRoseItem.gildedRoseItem(item).updateQualityManually();
        assertEquals(0, item.quality);
    }



}
