package fh.campus02;

public class SumFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            sum = sum + i;
        }

        System.out.println(sum);


        String sentence = "Finally weekend!";

        for (int j = 1; j < 11; j++) {
            System.out.println(j + " " + sentence);
        }
    }
}
