package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    private Goods[] goods;

    public GildedRose(Goods[] goods) {
        this.goods = goods;
    }

    public Goods[] getGoods() {
        return this.goods;
    }

    public void updateGoodsEveryDay() {
        Arrays.stream(this.goods).forEach(Goods::updateInfoEveryDay);
    }
}
