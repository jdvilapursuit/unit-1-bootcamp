
public class Variables {

  public String isOdd(int oddNumber) {

    String even;
    String odd;

    if (oddNumber % 2 == 0) {
      even = "This number is even";

      return even;

    } else

      odd = "This number is odd"

    return odd;

  }

  public String printHelloWorld(boolean trueOrFalse) {

    String isTrue;
    String isFalse;

    if (trueOrFalse == true) {
      isTrue = "Hello World!";
      return isTrue;
    } else isFalse = "There is no spoon";
    return isFalse;
  }

  public static greatestCommonFactor(int num1, int num2) {


    int gcf = 1;
    int k = 2;

    while (k <= num1 && k <= num2) {
      if (num1 % k == 0 && num2 % k == 0) {
      }
      gcd = k;
      k++;
    }
    System.out.println("The Greatest Common Factor for " + num1 + " and " + num2 + " is " + gcf);
  }



  public static void main(String args[]) {

    isOdd(2);
    printHelloWorld(true);
    greatestCommonFactor(12,2);
  }
}
