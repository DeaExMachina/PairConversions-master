package fh.campus02;

public class GradingTableSwitch {
    public static void main(String[] args) {

    }

    public static String getGradeText (int grade) {
        String gradeText;
        return switch (grade) {
            case 1 -> gradeText = "Outstanding";
            case 2 -> gradeText = "Excellent";
            case 3 -> gradeText = "Acceptable";
            case 4 -> gradeText = "Passing";
            case 5 -> gradeText = "Fail";
            default -> gradeText = null;
        };


    }
}
