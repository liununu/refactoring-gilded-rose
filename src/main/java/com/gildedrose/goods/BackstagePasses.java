package com.gildedrose.goods;

import com.gildedrose.Goods;

public class BackstagePasses extends Goods {

    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;

            if (this.sellIn < 11) {
                if (this.quality < 50) {
                    this.quality = this.quality + 1;
                }
            }

            if (this.sellIn < 6) {
                if (this.quality < 50) {
                    this.quality = this.quality + 1;
                }
            }
        }
    }

    @Override
    public void updateSellInWhenExpired() {
        this.quality = 0;
    }
}
