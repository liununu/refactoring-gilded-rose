package com.gildedrose.goods;

import com.gildedrose.Goods;

public class AgedBrie extends Goods {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }
}
