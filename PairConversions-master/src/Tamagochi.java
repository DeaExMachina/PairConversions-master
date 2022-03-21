public class Tamagochi {
    public void main(String[] args) {

        int x = 6;
        int y = 4;
        int futterstand = 5;

    }

        public void bewegDich (int schritte, String richtung){
            int x = 6;
            int y = 4;
            int futterstand = 5;

            while (x > 0 && y > 0) {
                if (richtung == "Links") {
                    x--1;
                    futterstand--;
                }
                else if (richtung == "Rechts") {
                    x++;
                    futterstand--;
                }
                else if (richtung == "Oben") {
                    y++;
                    futterstand--;
                }
                else if (richtung == "Unten") {
                    y--;
                    futterstand--;
                }

                if (futterstand < 1) {
                    futterstand = futterstand + 5;
                }
                x--;
                y--;
                futterstand--;
            }
        }

        public void fuettern ( int futterstand){
            if (futterstand < 1) {
                futterstand = futterstand + 5;
            }
        }
    }


