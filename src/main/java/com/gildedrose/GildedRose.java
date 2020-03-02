package com.gildedrose;

class GildedRose {
    Goods[] goods;

    public GildedRose(Goods[] goods) {
        this.goods = goods;
    }

    public void update_quality() {
        for (Goods good : goods) {
            if (!good.name.equals("Aged Brie")
                    && !good.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (good.quality > 0) {
                    if (!good.name.equals("Sulfuras, Hand of Ragnaros")) {
                        good.quality = good.quality - 1;
                    }
                }
            } else {
                if (good.quality < 50) {
                    good.quality = good.quality + 1;

                    if (good.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (good.sellIn < 11) {
                            if (good.quality < 50) {
                                good.quality = good.quality + 1;
                            }
                        }

                        if (good.sellIn < 6) {
                            if (good.quality < 50) {
                                good.quality = good.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!good.name.equals("Sulfuras, Hand of Ragnaros")) {
                good.sellIn = good.sellIn - 1;
            }

            if (good.sellIn < 0) {
                if (!good.name.equals("Aged Brie")) {
                    if (!good.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (good.quality > 0) {
                            if (!good.name.equals("Sulfuras, Hand of Ragnaros")) {
                                good.quality = good.quality - 1;
                            }
                        }
                    } else {
                        good.quality = good.quality - good.quality;
                    }
                } else {
                    if (good.quality < 50) {
                        good.quality = good.quality + 1;
                    }
                }
            }
        }
    }
}
