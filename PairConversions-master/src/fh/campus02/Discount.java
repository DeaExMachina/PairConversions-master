package fh.campus02;

public class Discount {
    public static void main(String[] args) {
        boolean isDog = false;
        boolean isSenior = true;
        boolean isStudent = true;
        double discount;
        double ticketPrice = 2.5;

        if (isDog) {
            discount = ticketPrice * 0.2;
        }
        else if (isSenior) {
            discount = ticketPrice * 0.15;
        }
        else if (isStudent) {
            discount = ticketPrice * 0.1;
        }
        else {
            discount = 0;
        }

        System.out.println("I saved " + discount + "€ for my " + ticketPrice + "€ ticket.");

        }
    }
