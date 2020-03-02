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

    void updateQuality() {
        if (!this.isAgedBrie()
                && !this.isBackstagePasses()) {
            if (quality > 0) {
                if (!this.isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (this.isBackstagePasses()) {
                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }

        if (!this.isSulfuras()) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!this.isAgedBrie()) {
                if (!this.isBackstagePasses()) {
                    if (quality > 0) {
                        if (!this.isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    private boolean isSulfuras() {
        return this.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isAgedBrie() {
        return this.name.equals("Aged Brie");
    }

    private boolean isBackstagePasses() {
        return this.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}
