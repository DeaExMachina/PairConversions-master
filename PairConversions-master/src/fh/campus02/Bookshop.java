package fh.campus02;

public class Bookshop {

    public static void main(String[] args) {
        int nonFiction = 3;
        int fiction = 1;
        boolean discount;

        discount = getBookDiscount(nonFiction, fiction);


        System.out.println("I will get a discount: " + discount);

    }

    public static boolean getBookDiscount (int nonFiction, int fiction) {
        boolean discount;
        if (nonFiction > 2 && fiction >= 1) {
            discount = true;
        }
        else {
            discount = false;
        }
        return discount;
    }
}

