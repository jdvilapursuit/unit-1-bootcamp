
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


    int firstCommonFactor = 1;
    int secondCommonFactor = 2;


    while (secondCommonFactor <= num1 && secondCommonFactor <= num2) {
      if (num1 % secondCommonFactor == 0 && num2 % secondCommonFactor == 0) {
      }
      firstCommonFactor = secondCommonFactor;
      secondCommonFactor++;
    }
    System.out.println("The Greatest Common Factor for " + num1 + " and " + num2 + " is " + firstCommonFactor);
  }



  public static void main(String args[]) {

    isOdd(2);
    printHelloWorld(true);
    greatestCommonFactor(12,2);
  }
}
