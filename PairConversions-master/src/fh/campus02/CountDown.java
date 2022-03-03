package fh.campus02;

public class CountDown {
    public static void main(String[] args) {
        int start = 5;

        start = countingDown(start);


    }

    public static int countingDown (int start) {

        while (start >= 0) {
            System.out.println(start);
            start--;
        }

        return start;
    }
}

