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

        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 0));
    }

    // Die folgende Methode soll die über das Jahr verkauften Zahlen eines Smartphones zurückliefern
    // zahlen: unsere Verkaufszahlen
    // welchesSmartphone: Index, der angibt, an welchem Smartphone wir interessiert sind (0-4)
    // weitere Anforderung: Wenn ungültiger Wert auf welchesSmartphone wurde, -1 zurückgeben


    public static int verkaufteAnzahlJahr (int [][] zahlen, int welchesSmartphone) {

        if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length) {
            return -1;
        }

        int summe = 0;
        for (int zIndex = 0; zIndex < zahlen[welchesSmartphone].length; zIndex++) {
            summe += zahlen[welchesSmartphone][zIndex];

        }
        return summe;
    }
    //Die folgende Methode soll uns den Namen des Smartphones liefern, das in einem bestimmten Quartal am erfolgreichsten war
    // zahlen: unsere Verkaufszahlen
    // namen: unsere Smartphone-Namen
    // quartalNr: für welches Quartal soll berechnet werden (1-4), sonst Rückgabewert leerer String

    public static String erfolgreichstesSmartphoneQuartal (int [][] zahlen, String[] namen, int quaralNr) {



        return ": "; //TODO: durch korrekten Code ersetzen!
    }
}
