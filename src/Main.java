public class Main {
    static boolean yesPointRightOfParabola = false;
    static boolean yesPointAboveOfLine2 = false;
    static boolean yesPointLeftOfParabola = false;
    static boolean yesPointUnderOfLine2 = false;
    static boolean yesPointLeftOfLine1 = false;
    static boolean yesPointRightOfLine1 = false;
    static String Color;

    public static void main(String[] args) {

        System.out.println(GetColor(3,2));
    }


    private static String GetColor(double x, double y) {
        if (IsPointRightOfParabola(x, y)) {
            Color = "Orange";
        }
        if (IsPointAboveOfLine2(y) && IsPointLeftOfParabola(x, y)) {
            Color = "Grey";
        }
        if (IsPointUnderOfLine2(y) && IsPointLeftOfLine1(x, y)) {
            Color = "Green";
        }
        if (IsPointUnderOfLine2(y) && IsPointRightOfLine1(x, y)) {
            Color = "Yellow";
        }
        return Color;
    }

    private static boolean IsPointRightOfLine1(double x, double y) {
        if (y < 2.5 * x + 8.5) {
            yesPointRightOfLine1 = true;
        }
        return yesPointRightOfLine1;
    }

    private static boolean IsPointLeftOfLine1(double x, double y) {
        if (y > 2.5 * x + 8.5) {
            yesPointLeftOfLine1 = true;
        }
        return yesPointLeftOfLine1;
    }

    private static boolean IsPointUnderOfLine2(double y) {
        if (y < -2) {
            yesPointUnderOfLine2 = true;
        }
        return yesPointUnderOfLine2;
    }

    private static boolean IsPointAboveOfLine2(double y) {
        if (y > -2) {
            yesPointAboveOfLine2 = true;
        }
        return yesPointAboveOfLine2;
    }

    private static boolean IsPointRightOfParabola(double x, double y) {
        if (y * (y - 4) < x - 6) {
            yesPointRightOfParabola = true;
        }
        return yesPointRightOfParabola;
    }

    private static boolean IsPointLeftOfParabola(double x, double y) {
        if (y * (y - 4) > x - 6) {
            yesPointLeftOfParabola = true;
        }
        return yesPointLeftOfParabola;
    }

}
