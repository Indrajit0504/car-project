package fr.efrei.cartp1;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {
    protected float maxWeight;

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Van(String plateNumber, float maxWeight) {
        super(plateNumber);
        this.maxWeight = maxWeight;
    }
}
