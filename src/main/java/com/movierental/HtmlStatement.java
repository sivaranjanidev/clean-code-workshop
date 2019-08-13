package com.movierental;

class HtmlStatement {
  public String display(String name, Rentals rentals) {
    String result = "<h1>Rental Record for " + name + "</h1><br>";
    for (Rental rental : rentals) {
      //show figures for this rental
      result += " " + rental.getMovie().getTitle() + " " +
              String.valueOf(rental.amountFor()) + "<br>";
    }
    //add footer lines result
    result += "Amount owed is " + String.valueOf(rentals.getTotalAmount()) + "<br>";
    result += "You earned " + String.valueOf(rentals.getFrequentRenterPoints())
            + " frequent renter points";
    return result;
  }
}
