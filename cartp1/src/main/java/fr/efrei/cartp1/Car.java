package fr.efrei.cartp1;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {

    protected int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String plateNumber, int numberOfSeats) {
        super(plateNumber);
        this.numberOfSeats = numberOfSeats;
    }
}
