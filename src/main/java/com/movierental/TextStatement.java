package com.movierental;

class TextStatement {
  public String display(String name, Rentals rentals) {
    String result = "Rental Record for " + name + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
              String.valueOf(rental.amountFor()) + "\n";
    }
    result += "Amount owed is " + String.valueOf(rentals.getTotalAmount()) + "\n";
    result += "You earned " + String.valueOf(rentals.getFrequentRenterPoints())
            + " frequent renter points";
    return result;
  }
}
