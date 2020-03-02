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

    private void updateSellInWhenExpired() {
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

    private void updateQuality() {
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
    }

    public void updateSellIn() {
        sellIn = sellIn - 1;
    }

    private boolean isExpired() {
        return sellIn < 0;
    }
}
