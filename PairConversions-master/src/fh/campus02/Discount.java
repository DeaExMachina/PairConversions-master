package fh.campus02;

public class Discount {
    public static void main(String[] args) {
        boolean isDog = false;
        boolean isSenior = false;
        boolean isStudent = false;
        boolean discount;

        if (isDog) {
            discount = true;
        }
        else if (isSenior) {
            discount = true;
        }
        else if (isStudent) {
            discount = true;
        }
        else {
            discount = false;
        }

        System.out.println("I get a discount: " + discount);

        }
    }
