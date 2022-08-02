package com.gildedrose;

public class Item_Base_AgedBrie  extends Item_Base {

    public String name;

    public int sellIn;

    public int quality;

    public Item_Base_AgedBrie(String name, int sellInInitial,int sellInCurrent, int quality) {

        super(sellIn,quality);
        this.name="Aged Brie",
            this.sellInInitial = sellInInitial
    }


    @override
    public int quality_Changed(){
        sellInCurrent=sellIn-1
        increase = sellInInitial-sellInCurrent
        quality = quality + increase
    }
}
