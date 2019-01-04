
public class Methods {

  public int calculateSquare (int num1){

    int squarednumber = num1 * num1;

    return squarednumber;
  }
  public int calculateSquareRoot (int num1){

  int squareRoot = Math.sqrt(num1);

  return squareRoot;
  }
  public boolean isMultiple (int num1, int num2){

    if (num2 % num1 == 0) {
      return true;
    }
    return false;
  }


  public static void main (String args[]) {

  }
}
