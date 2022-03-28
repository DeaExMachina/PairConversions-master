public class smallestNumber {
    public int findeKleinsteZahl (int [] numbers) {
        int smallest = 0;
        //int index = numbers[0 + 1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public  void main(String[] args) {
        System.out.println(findeKleinsteZahl(10, 4, 17, 8, 2));

    }
}
