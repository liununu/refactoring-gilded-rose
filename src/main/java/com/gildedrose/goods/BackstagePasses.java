package com.gildedrose.goods;

import com.gildedrose.Goods;

public class BackstagePasses extends Goods {

    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public boolean isBackstagePasses() {
        return true;
    }
}
