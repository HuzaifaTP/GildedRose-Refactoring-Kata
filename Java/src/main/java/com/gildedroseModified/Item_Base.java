package com.gildedrose;

public class Item_Base extends Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item_Base(String name, int sellIn, int quality,) {
       super(name,sellIn,quality)
    }

    public int quality_Validate(){
     if(quality>50){
         quality=50;
     }
    }
    public int quality_Changed(){
        quality=quality-1;
    }
}
