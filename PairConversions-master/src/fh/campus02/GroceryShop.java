package fh.campus02;

public class GroceryShop {
    public static void main(String[] args) {
        boolean drink = true;
        boolean alcoholic = true;
        boolean discount;

        discount = discountAvailable(drink, alcoholic);

        System.out.println("I will get a discount: " + discount);

    }

    public static boolean discountAvailable(boolean drink, boolean alcoholic) {
        boolean discount;
        if (drink == true && alcoholic == false) {
            discount = true;
        }
        else discount = false;
        return discount;
    }
}

