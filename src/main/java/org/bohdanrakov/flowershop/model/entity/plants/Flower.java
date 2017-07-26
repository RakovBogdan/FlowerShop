package org.bohdanrakov.flowershop.model.entity.plants;

public class Flower extends Plant {

    private String name;
    private boolean requiresFood;
    private boolean requiresHolding;

    public boolean isRequiresFood() {
        return requiresFood;
    }

    public void setRequiresFood(boolean requiresFood) {
        this.requiresFood = requiresFood;
    }

    public boolean isRequiresHolding() {
        return requiresHolding;
    }

    public void setRequiresHolding(boolean requiresHolding) {
        this.requiresHolding = requiresHolding;
    }
}
