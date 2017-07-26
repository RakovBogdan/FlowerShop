package org.bohdanrakov.flowershop.model.entity.bouquet;

import org.bohdanrakov.flowershop.model.entity.accesories.*;
import org.bohdanrakov.flowershop.model.entity.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private String name;

    private Price price;

    private BouquetType bouquetType;
    private Stem stem;
    private Size size;
    private Freshness freshness;
    private List<Plant> plants = new ArrayList<>();

    private Basket basket;

    private Ribbon ribbon;
    private Wrapping wrapping;
    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void removePlant(Plant plant) {
        plants.remove(plant);
    }

    @Override
    public String toString() {
        return "Bouquet: " + bouquetType + "\n" +
                "Plants: " + plants + "\n" +
                "Price: " + price + "\n" +
                "Size: " + size + "\n" +
                "Freshness: " + freshness + "\n" +
                "Stem: " + stem + "\n" +
                "Has basket: " + basket + "\n" +
                "Has ribbon: " + ribbon + "\n" +
                "Has Wrapping: " + ribbon + "\n";
    }

    public List<Plant> getPlants() {
        return this.plants;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(BouquetType bouquetType) {
        this.bouquetType = bouquetType;
    }

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(Ribbon ribbon) {
        this.ribbon = ribbon;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
