public class smallestNumber {
    public static int findeKleinsteZahl (int [] numbers) {
        int smallest = numbers[0];
        //int index = numbers[0 + 1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; //um den Index des Arrays zu bekommen: smallest = i --> zeigt den Wert an der Stelle im Array an
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int [] numbers = {12, 1, 8, 6, 10, 3};
        System.out.println(findeKleinsteZahl(numbers));

    }
}
