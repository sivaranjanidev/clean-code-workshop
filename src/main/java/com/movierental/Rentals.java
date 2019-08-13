package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amountFor();
        }
        return totalAmount;
    }

}
