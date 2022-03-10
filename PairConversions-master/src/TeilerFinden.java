public class TeilerFinden {
    public static void main(String[] args) {
        int zahl = 130;
        int teiler = 4;

        while (teiler < zahl) {
            if (zahl %teiler == 0) {
                System.out.println("Die Zahl " + teiler + " ist ein Teiler von " + zahl);
            }
            teiler++;
        }
    }
}
