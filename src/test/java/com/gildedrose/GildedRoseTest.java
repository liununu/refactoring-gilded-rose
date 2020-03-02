package com.gildedrose;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void should_keep_original_quality_when_create_gilded_rose_without_update() {
        // given
        Goods[] goods = buildItemsForTest();

        // when
        GildedRose gildedRose = new GildedRose(goods);

        // then
        assertThat(Arrays.toString(gildedRose.goods),
                is("[+5 Dexterity Vest, 10, 20, " +
                        "Aged Brie, 2, 0, " +
                        "Elixir of the Mongoose, 5, 7, " +
                        "Sulfuras, Hand of Ragnaros, 0, 80, " +
                        "Sulfuras, Hand of Ragnaros, -1, 80, " +
                        "Backstage passes to a TAFKAL80ETC concert, 15, 20, " +
                        "Backstage passes to a TAFKAL80ETC concert, 10, 49, " +
                        "Backstage passes to a TAFKAL80ETC concert, 5, 49, " +
                        "Backstage passes to a TAFKAL80ETC concert, 1, 20, " +
                        "Conjured Mana Cake, 3, 6]"));
    }

    @Test
    public void should_update_first_day_quality_when_gilded_rose_update_once() {
        // given
        Goods[] goods = buildItemsForTest();

        // when
        GildedRose gildedRose = new GildedRose(goods);
        gildedRose.updateQuality();

        // then
        assertThat(Arrays.toString(gildedRose.goods),
                is("[+5 Dexterity Vest, 9, 19, " +
                        "Aged Brie, 1, 1, " +
                        "Elixir of the Mongoose, 4, 6, " +
                        "Sulfuras, Hand of Ragnaros, 0, 80, " +
                        "Sulfuras, Hand of Ragnaros, -1, 80, " +
                        "Backstage passes to a TAFKAL80ETC concert, 14, 21, " +
                        "Backstage passes to a TAFKAL80ETC concert, 9, 50, " +
                        "Backstage passes to a TAFKAL80ETC concert, 4, 50, " +
                        "Backstage passes to a TAFKAL80ETC concert, 0, 23, " +
                        "Conjured Mana Cake, 2, 5]"));
    }

    @Test
    public void should_update_second_day_quality_when_gilded_rose_update_twice() {
        // given
        Goods[] goods = buildItemsForTest();

        // when
        GildedRose gildedRose = new GildedRose(goods);
        gildedRose.updateQuality();
        gildedRose.updateQuality();

        // then
        assertThat(Arrays.toString(gildedRose.goods),
                is("[+5 Dexterity Vest, 8, 18, " +
                        "Aged Brie, 0, 2, " +
                        "Elixir of the Mongoose, 3, 5, " +
                        "Sulfuras, Hand of Ragnaros, 0, 80, " +
                        "Sulfuras, Hand of Ragnaros, -1, 80, " +
                        "Backstage passes to a TAFKAL80ETC concert, 13, 22, " +
                        "Backstage passes to a TAFKAL80ETC concert, 8, 50, " +
                        "Backstage passes to a TAFKAL80ETC concert, 3, 50, " +
                        "Backstage passes to a TAFKAL80ETC concert, -1, 0, " +
                        "Conjured Mana Cake, 1, 4]"));
    }

    private Goods[] buildItemsForTest() {
        return new Goods[]{
                new Goods("+5 Dexterity Vest", 10, 20),
                new Goods("Aged Brie", 2, 0),
                new Goods("Elixir of the Mongoose", 5, 7),
                new Goods("Sulfuras, Hand of Ragnaros", 0, 80),
                new Goods("Sulfuras, Hand of Ragnaros", -1, 80),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                new Goods("Conjured Mana Cake", 3, 6)};
    }
}
