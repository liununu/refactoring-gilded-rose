package com.gildedrose;

class GildedRose {
    Goods[] goods;

    public GildedRose(Goods[] goods) {
        this.goods = goods;
    }

    public void update_quality() {
        for (Goods good : goods) {
            if (!isAgedBrie(good)
                    && !isBackstagePasses(good)) {
                if (good.quality > 0) {
                    if (!isSulfuras(good)) {
                        good.quality = good.quality - 1;
                    }
                }
            } else {
                if (good.quality < 50) {
                    good.quality = good.quality + 1;

                    if (isBackstagePasses(good)) {
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

            if (!isSulfuras(good)) {
                good.sellIn = good.sellIn - 1;
            }

            if (good.sellIn < 0) {
                if (!isAgedBrie(good)) {
                    if (!isBackstagePasses(good)) {
                        if (good.quality > 0) {
                            if (!isSulfuras(good)) {
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

    private boolean isSulfuras(Goods good) {
        return good.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isAgedBrie(Goods good) {
        return good.name.equals("Aged Brie");
    }

    private boolean isBackstagePasses(Goods good) {
        return good.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}
