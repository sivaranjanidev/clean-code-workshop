package com.movierental;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void test(){}

    @Test
    public void testStatement() {
        Customer testCustomer = new Customer("Ranjani");
        testCustomer.addRental(new Rental(new Movie("NKP", Movie.NEW_RELEASE), 4));
        testCustomer.addRental(new Rental(new Movie("The Lion King", Movie.CHILDRENS),2));

        assertEquals("Rental Record for Ranjani\n" +
                "\tNKP\t12.0\n" +
                "\tThe Lion King\t1.5\n" +
                "Amount owed is 13.5\n" +
                "You earned 3 frequent renter points", testCustomer.statement());
    }

    @Test
    public void testHtmlStatement() {
        Customer testCustomer = new Customer("Ranjani");
        testCustomer.addRental(new Rental(new Movie("NKP", Movie.NEW_RELEASE), 4));
        testCustomer.addRental(new Rental(new Movie("The Lion King", Movie.CHILDRENS),2));

        assertEquals("<h1>Rental Record for Ranjani</h1><br> NKP 12.0<br> The Lion King 1.5<br>Amount owed is 13.5<br>You earned 3 frequent renter points", testCustomer.htmlStatement());
    }
}