public class Matrix {
    public static void main(String[] args) {
        int [] [] tabelle = new int [4] [3];

        //alle Werte auf 7 setzen
        //das ist die Schleife für unsere Zeilen
        for (int zeile = 0; zeile < tabelle.length; ++zeile) {
            //das ist die Schleife für unsere Spalten
            for (int spalte = 0; spalte < tabelle[zeile].length; ++spalte) {
                tabelle [zeile][spalte] = 42;
                System.out.println(tabelle[zeile] [spalte]);

            }
        }

    }


}
// 2 Schleifen werden gebraucht, weil zweidimensionales Array!