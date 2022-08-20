package com.gildedroseModified;

public class AgedBrie  extends Update_Patterns_Dictionary {

    private final Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateQualityManually() {
        AgedBrieUpdatePattern(item);
    }
}
