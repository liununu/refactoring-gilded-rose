package com.gildedrose;

class GildedRose {
    Goods[] goods;

    public GildedRose(Goods[] goods) {
        this.goods = goods;
    }

    public void update_quality() {
        for (int i = 0; i < goods.length; i++) {
            if (!goods[i].name.equals("Aged Brie")
                    && !goods[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (goods[i].quality > 0) {
                    if (!goods[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        goods[i].quality = goods[i].quality - 1;
                    }
                }
            } else {
                if (goods[i].quality < 50) {
                    goods[i].quality = goods[i].quality + 1;

                    if (goods[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (goods[i].sellIn < 11) {
                            if (goods[i].quality < 50) {
                                goods[i].quality = goods[i].quality + 1;
                            }
                        }

                        if (goods[i].sellIn < 6) {
                            if (goods[i].quality < 50) {
                                goods[i].quality = goods[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!goods[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                goods[i].sellIn = goods[i].sellIn - 1;
            }

            if (goods[i].sellIn < 0) {
                if (!goods[i].name.equals("Aged Brie")) {
                    if (!goods[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (goods[i].quality > 0) {
                            if (!goods[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                goods[i].quality = goods[i].quality - 1;
                            }
                        }
                    } else {
                        goods[i].quality = goods[i].quality - goods[i].quality;
                    }
                } else {
                    if (goods[i].quality < 50) {
                        goods[i].quality = goods[i].quality + 1;
                    }
                }
            }
        }
    }
}
