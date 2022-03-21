public class Tamagochi {

    public int x;
    public int y;
    public int futterstand;

    void fuettern (int zusatzfutter) {
        futterstand = futterstand + zusatzfutter;
    }

    public void bewegDich (int schritte, String richtung){

        //Schritte-Variable als Zähler verwendet

        while (futterstand > 0 && schritte > 0) {
            if (richtung.equals("links")) {
                    x--;
                }
            else if (richtung.equals("rechts")) {
                    x++;
                }
            else if (richtung.equals("oben")) {
                    y++;
                }
            else if (richtung.equals("unten")) {
                    y--;
                }

            schritte--;
            futterstand--;

//            if (futterstand < 1) {
//                    fuettern(5);
//                }
            }
        }

    public static void main(String[] args) {
        Tamagochi neon = new Tamagochi();
        neon.x = 6;
        neon.y = 4;
        neon.futterstand = 5;

        neon.bewegDich(5, "links");
        neon.fuettern(5);
        neon.bewegDich(1, "links");
        neon.bewegDich(4, "unten");
        System.out.println(neon.x + " " + neon.y);
    }

    }


