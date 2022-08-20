package com.gildedroseModified;

public abstract class Update_Patterns_Dictionary extends Abstract_Functions_Universal implements GildedRoseItem {


    void BaseItemUpdatePattern(Item item){
        decreaseQuality(item);
        decreaseSellIn(item);
        if (hasExpired(item)) {
            decreaseQuality(item);
        }
    }
    void AgedBrieUpdatePattern(Item item){
        increaseQuality(item);
        decreaseSellIn(item);
        if (hasExpired(item)) {
            increaseQuality(item);
        }
    }
    void ConjuredUpdatePattern(Item item){
        decreaseQuality(item);
        decreaseQuality(item);
        decreaseSellIn(item);
    }
    void BackStagePassesUpdatePattern(Item item){
        ageWell(item);
        decreaseSellIn(item);
        if (hasExpired(item)) {
            item.quality = 0;
        }
    }
    void ageWell(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                increaseQuality(item);
            }
            if (item.sellIn < 6) {
                increaseQuality(item);
            }
        }
    }
    }


