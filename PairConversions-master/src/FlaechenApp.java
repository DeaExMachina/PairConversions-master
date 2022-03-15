public class FlaechenApp {
    public static void main (String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;

        System.out.println(a.x + " " + a.y);

        a.anderePosition(1, 2);
        System.out.println(a.x + " " + a.y);

        //da a und c beide Referenzen sind und auf das gleiche Punktobjekt zeigen:
        if (a == c) {
            System.out.println("a und c zeigen beide auf die gleiche Punktinstanz!");
        }
    }
}
