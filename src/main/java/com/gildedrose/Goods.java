package com.gildedrose;

public class Goods {

    public String name;

    public int sellIn;

    public int quality;

    public Goods(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateInfoEveryDay() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateSellInWhenExpired();
        }
    }

    public boolean isSulfuras() {
        return false;
    }

    public boolean isAgedBrie() {
        return false;
    }

    public boolean isBackstagePasses() {
        return false;
    }

    public void updateSellInWhenExpired() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }

    public void updateQuality() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }

    public void updateSellIn() {
        sellIn = sellIn - 1;
    }

    private boolean isExpired() {
        return sellIn < 0;
    }
}
