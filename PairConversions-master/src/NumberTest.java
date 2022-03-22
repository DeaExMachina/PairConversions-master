public class NumberTest {
    //Jahrzehnt eines Alters ermitteln - wie?

    public static void main(String[] args) {
       int age = 25;
       int jahrzehnt = age/10;

        System.out.println(jahrzehnt);

        // Wie komme ich zur Zehnerstelle in einer Zahl? (z.B. 137 --> 3)

        //zuerst durch 10, damit wir 7 verschwinden lassen
        // dann Modulo 10 für die aktuell letzte Stelle (3)

        int zehnerstelle = (137 / 10) % 10; //nur bei Int-Division möglich bzw. sinnvoll!
        int zehnerstelle2 = (845 / 10) % 10;
        System.out.println(zehnerstelle);
        System.out.println(zehnerstelle2);



    }
}
