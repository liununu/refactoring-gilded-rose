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
        this.sellIn = this.sellIn - 1;
    }

    private boolean isExpired() {
        return this.sellIn < 0;
    }
}
