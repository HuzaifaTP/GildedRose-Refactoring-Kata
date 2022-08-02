package com.gildedrose;

public class Item_Base_BackStagePasses  extends Item_Base {

    public String name;

    public int sellIn;

    public int quality;

    public Item_Base_BackStagePasses(String name, int sellIn, int quality) {

        super(sellIn,quality);
        this.name="Backstage passes"
    }


    @override
    public int quality_Changed(){
        if(sellIn<=10){
            quality= quality+2
        }else if(sellIn<=5){
            quality= quality+3
        }else{
            quality=quality+1
        }
        sellIn=sellIn-1
    }
}
