import java.util.Arrays;

public class Gegendiagonale {
    public static int summeGegendiagonale (int array1 [][]) {
        int diagonale = 0;

        for (int i = 0; i < array1.length; i++) {
                    //Wert in der i-ten Zeile und der i-ten Spalte
                    diagonale += array1[i][array1.length - 1 - i];
            }
            return diagonale;
        }

    public static void main(String[] args) {
        int [][] array1 =  {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 1, 2, 3},
                            {4, 5, 6, 7}};
        System.out.println(summeGegendiagonale(array1));
    }
}
