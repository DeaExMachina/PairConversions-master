import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {

        String hansisLieblingspizza = null; //zeigt nirgendwo hin; man kann nix damit tun, weil kein Stringobjekt dahinter steht
        //hansisLieblingspizza.indexOf("a");

        //Sobald man aber ein Objekt zuweist, ist die Null-Exception beseitigt

        hansisLieblingspizza = "Margherita (mit ein bis zwei Ananasstückchen unter dem Käse versteckt)";

        System.out.println(hansisLieblingspizza);
        System.out.println(hansisLieblingspizza.toUpperCase());

        String donau = "Donaudampfschifffahrtsgesellschaftskapitänskajüte";
        System.out.println(donau.indexOf("dampf")); //zeigt die Stelle im String, an der "Dampf" erstmals beginnt
    }
}
