public class ArrayTest2 {
    public static void main(String[] args) {
        String[] smartPhoneNamen = {"Samsung A51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7t"};
        // jede Zeile steht für ein Smartphone
        // jede Spalte in der Zeile steht für Verkaufszahlen im jeweiligen Quartal
        int [][] smartphoneVerkaufszahlen = {{2000, 3000, 4000, 1000}, {2500, 3600, 4700, 1100}, {5000, 3000, 2000, 1500},
                {2700, 3500, 4300, 1200}, {6000, 5000, 4000, 3000}};

        for (int sNr = 0; sNr < smartPhoneNamen.length; ++sNr) {
            System.out.println(smartPhoneNamen[sNr]);
        }

        //for-each-loop:
        //rechts vom : steht das Array (oder was anderes, das Daten beinhaltet)
        //links daneben eine Laufvariable mit dem Typ des Arrays (beliebig benennbar)
        for (String smartphone : smartPhoneNamen) {
            System.out.println(smartphone);
        }

        //alle Verkaufszahlen inklusive Name ausgeben

        for (int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; ++sIndex) {
            System.out.print(smartPhoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; ++qIndex) {
                System.out.print(smartphoneVerkaufszahlen[sIndex] [qIndex] + " ");
            }
            // nach Ausgabe aller Quartalszahlen einen Zeilenumbruch
            System.out.println();
        }
    }
}
