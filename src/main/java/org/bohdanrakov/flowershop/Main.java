package org.bohdanrakov.flowershop;

import org.bohdanrakov.flowershop.model.entity.accesories.Basket;
import org.bohdanrakov.flowershop.model.entity.bouquet.*;
import org.bohdanrakov.flowershop.model.entity.plants.Branch;
import org.bohdanrakov.flowershop.model.entity.plants.Bush;
import org.bohdanrakov.flowershop.model.entity.plants.Flower;

public class Main {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.setName("De la rosa");

        Flower flower = new Flower();
        flower.setName("Rose");
        Bush bush = new Bush();
        bush.setName("Bushy");
        Branch branch = new Branch();
        branch.setName("Branchy");

        bouquet.addPlant(flower);
        bouquet.addPlant(branch);
        bouquet.addPlant(bush);

        bouquet.setBasket(new Basket());
        bouquet.setBouquetType(BouquetType.PARTY);
        bouquet.setPrice(Price.EXPENSIVE);
        bouquet.setFreshness(Freshness.VERY_FRESH);
        bouquet.setSize(Size.MEDIUM);
        bouquet.setStem(Stem.LONG);
        System.out.println(bouquet);
    }
}
