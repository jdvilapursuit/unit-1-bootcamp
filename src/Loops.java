import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class Loops {

    public static void main(String args[]) {

        for (int i = 0; i <= 60; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i + j == 60 && i - j == 14) {
                    System.out.println(i + "," + j);
                }
            }
        }

        for (int j = 1; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println("" + j + k + "," + j + "+" + k + "=" + (k + j));
            }
        }
    }

    public static void printOneThroughTenUsingALoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printOneThroughTenUsingADifferentKindOfLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void printOneThroughN(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static void printEvenNumbersTwoThroughN(int n) {
        int i = 2;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printSumOfOneThroughTenUsingALoop() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOfOneThroughNUsingALoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printStringNTimes(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            int i = 1;
            while (i <= n) {
                System.out.println(s);
                i++;
            }
        }
    }

    public static void printStringConcatenatedWithItselfNTimes(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            int i = 1;
            String result = "";
            while (i <= n) {
                result += s;
                i++;
            }
            System.out.println(result);
        }
    }

    public static void printFirstTenFibonacciNumbers() {
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                System.out.println(fib1 + fib2);
                int temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
            }
        }
    }

    public static void printSumOfFirstTenFibonacciNumbers() {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;

        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                sum += i;
            } else {
                int temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
                sum += fib2;
            }
        }
        System.out.println(sum);
    }

    public static void printSumOfFirstNFibonacciNumbers(int n) {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                sum += i;
            } else {
                int temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
                sum += fib2;
            }
        }
        System.out.println(sum);
    }

    public static int sumNumbers(String s) {
        int sum = 0;
        String[] sArr = s.split("[a-zA-z]+");
        for (String str : sArr) {
            if (str.length() != 0) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }

    public static String notReplace(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 &&
                    s.length() > 1 &&
                    s.charAt(i) == 'i' &&
                    s.charAt(i + 1) == 's') {
                result += "is not";
                i += 1;
            } else if (i <= s.length() - 3 &&
                    !Character.isLetter(s.charAt(i)) &&
                    s.charAt(i + 1) == 'i' &&
                    s.charAt(i + 2) == 's') {
                if (i == s.length() - 3) {
                    result += s.charAt(i) + "is not";
                    i += 2;
                } else if (!Character.isLetter(s.charAt(i + 3))) {
                    result += s.charAt(i) + "is not" + s.charAt(i + 3);
                    i += 3;
                }
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void wordEnds(String str, String divider) {
        String result = "";
        for (int i = 0; i <= str.length() - divider.length(); i++) {
            if (str.substring(i, i + divider.length()).contains(divider)) {
                if (i == 0) {
                    if (i + divider.length() < str.length()) {
                        result += str.charAt(divider.length());
                    }
                } else if (i + divider.length() == str.length() &&
                        str.length() > divider.length()) {
                    result += str.charAt(i - 1);
                } else {
                    result += str.charAt(i - 1);
                    result += str.charAt(i + divider.length());
                }
            }
        }
        System.out.println(result);
    }

    public static String wordEndsTwo(String str, String divider) {
        String[] words = str.split("(?<=" + divider + ")|(?=" + divider + ")");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if(!words[i].equals(divider)){

                if(i == 0) {
                    result += words[i].charAt(words[i].length()-1);
                }else if(i == words.length - 1) {
                    result += words[i].charAt(0);
                }else{
                    result += words[i].charAt(0);
                    result += words[i].charAt(words[i].length()-1);
                }
            }
        }
        return result;
    }

    public static String wordEndsThree(String str, String divider) {
        String[] words = str.split("(?<=" + divider + ")|(?=" + divider + ")");
        String result = "";

        for(String s : words) {
            if (!s.equals(divider)) {

                if(s == words[0]) {
                    result += s.charAt(s.length()-1);
                }else if(s == words[words.length - 1]) {
                    result += s.charAt(0);
                }else{
                    result += s.charAt(0);
                    result += s.charAt(s.length()-1);
                }
            }
        }
        return result;
    }
}
