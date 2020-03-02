package com.gildedrose.goods;

import com.gildedrose.Goods;

public class BackstagePasses extends Goods {

    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            increaseQuality();

            if (this.sellIn < 11 && this.quality < 50) {
                increaseQuality();
            }

            if (this.sellIn < 6 && this.quality < 50) {
                increaseQuality();
            }
        }
    }

    @Override
    public void updateSellInWhenExpired() {
        this.quality = 0;
    }

    private void increaseQuality() {
        this.quality = this.quality + 1;
    }
}
