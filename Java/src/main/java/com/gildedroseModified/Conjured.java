package com.gildedroseModified;

public class Conjured extends Update_Patterns_Dictionary {

    private final Item item;
    public Conjured(Item item) {
        this.item = item;
    }

    public void updateQualityManually() {
        ConjuredUpdatePattern(item);
    }
}
