public class Metropolis {
    public static void main(String[] args) {

        System.out.println(isMetropolis(true, 80000, 120));
        System.out.println(isMetropolis(false, 100000, 450));
        System.out.println(isMetropolis(true, 300000, 270));
        System.out.println(isMetropolis(false, 200001, 700));



    }

    public static boolean isMetropolis (boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if ((isCapital && inhabitants > 100000) || ((inhabitants > 200000) && ((inhabitants * taxPerPersonAndMonth * 12) >= 720000000))) {
            return true;
        }
        else {
            return false;
        }
    }
}
