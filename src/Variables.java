
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

  public String printHelloWorld(boolean trueOrFalse){

    String isTrue;
    String isFalse;

    if (trueOrFalse == true){
      isTrue = "Hello World!";
      return isTrue;
    } else isFalse = "There is no spoon";
    return isFalse;
  }

  public static void main(String args[]) {

    isOdd(2);
    printHelloWorld(true);
  }
}
