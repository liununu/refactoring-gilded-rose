package com.gildedrose.goods;

import com.gildedrose.Goods;

public class Sulfuras extends Goods {

    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateSellInWhenExpired() {
    }
}
