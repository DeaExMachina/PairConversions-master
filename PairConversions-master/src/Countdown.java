public class Countdown {
    public static void main(String[] args) {
        countdown(99, 0);

    }

    public static void countdown (int start, int stop) {
        System.out.println(start);
        if (start > 0 && start > stop) {
            countdown(--start, stop); //wichtig, dass -- vor start steht!
        }



//        start = 50;
//        int stop = 2;
//
//        while (start > stop) {
//            start--;
//            System.out.println(start);
//        }
//
//
////        for (i = 99; i > 0; i--) {
////            System.out.println(i);
////        }
//        return start;

    }
}
