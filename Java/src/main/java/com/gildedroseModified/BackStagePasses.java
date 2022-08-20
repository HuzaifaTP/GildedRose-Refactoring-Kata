package com.gildedroseModified;

public class BackStagePasses extends Update_Patterns_Dictionary {

    private final Item item;

    public BackStagePasses(Item item) {
        this.item = item;
    }

    @Override
    public void updateQualityManually() {
        BackStagePassesUpdatePattern(item);
    }
}
