package fh.campus02;

public class ArithmeticTower {
    public static void main(String[] args) {
        int start = 1;

        arithmeticTower (start);


        }


    public static int arithmeticTower(int start)
    {
        start = 1;
        for (int number = 2; number < 9; number++)
        {
            System.out.println(start * number);

        }
        int number;
        int sum = start * number;
        return sum;
    }
}
