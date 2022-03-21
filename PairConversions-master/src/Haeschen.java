public class Haeschen {

    String name;
    String farbe;
    static String spezies = "Leporidae";

    public void hoppel(String wohin) {
        System.out.println(name + " hoppelt " + wohin);
    }

    public static void ausgabeSpezies() {
        spezies = "Lateinischer Name: " + spezies;
        System.out.println(spezies);
        System.out.println();
    }

}
