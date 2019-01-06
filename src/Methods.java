import java.util.Arrays;
import java.util.Random;

public class Methods {

  public int calculateSquare(int num1) {

    int squaredNumber;
    squaredNumber = num1 * num1;

    return squaredNumber;
  }

  public static  int calculateSquareRoot(int num1) {

    return (int) Math.sqrt(num1);
  }

  public static String toLowerCase(String str) {

    return str.toLowerCase();
  }

  public static boolean isMultiple(int num1, int num2) {

    if (num2 % num1 == 0) {
      return true;
    }
    return false;
  }

  private static void prettyInteger(int num1){

    char c = '*';
    char [] chars = new char[num1];
    Arrays.fill(chars,c);
    System.out.println(String.valueOf(chars) + " "+ num1 + " "+  String.valueOf(chars));

  }

  private static int random (int min, int max){

    int diff = max - min;
    Random rn = new Random();
    int i = rn.nextInt(diff + 1);
    i += min;
    System.out.print(i);
    return i;
  }

  public static void main(String args[]) {

    prettyInteger(8);
    random(6,25);

  }
}
