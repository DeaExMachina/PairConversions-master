package fh.campus02;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] schachtel = new int[] {2, 3, 5, 7, 11, 13, 17};

        printArray(schachtel);


    }

   public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
   }
}
