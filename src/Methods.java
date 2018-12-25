
public class Methods {

    public static void main(String args[]) {

    }

    public static int calculateSquare(int n) {
        return n*n;
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static boolean isMultiple(int n, int multiple) {
        return (multiple % n == 0);
    }

    public static void prettyInteger(int n) {
        String deco = "";

        for (int i = 0; i < n ; i++) {
            deco += "*";
        }

        System.out.println(deco + n + deco);
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * ((max-min) + 1) + min);
    }


}
