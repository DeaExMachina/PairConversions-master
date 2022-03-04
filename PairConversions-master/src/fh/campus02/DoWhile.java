package fh.campus02;

public class DoWhile {
    public static void main(String[] args) {

        countToHundred(0);

    }

    public static void countToHundred (int from) {

        do {
            from++;
            System.out.println(from);
        }
        while (from <= 99);
        }
    }


