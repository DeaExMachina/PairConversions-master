package fh.campus02;

public class ArithmeticTower {
    public static void main(String[] args) {
        int start = 12;

        arithmeticTower(start);

        }


    public static void arithmeticTower(int start)
    {
        for (int i = 2; i <= 9; i++) {
            System.out.println(start + " * " + i);
            start = start * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(start + " / " + i);
            start = start / i;
        }
    }
}
