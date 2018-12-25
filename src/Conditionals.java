
public class Conditionals {

    public static void main(String args[]) {
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (isMultipleOfThree(n) && isOdd(n)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (n % 2 != 0 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void fizzMultipleThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean isFromLondon(Person isBrit) {
        if (isBrit.getCity() == "London") {
            return true;
        } else {
            return false;
        }
    }

    public static void nameLongerThanFive(Person person) {
        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        if (weekend && cigars >= 40) {
            return true;
        }
        return !weekend && cigars >= 40 && cigars <= 60;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int s = speed;

        if (isBirthday) {
            s -= 5;
        }
        if (s <= 60) {
            return 0;
        } else if (s > 60 && s <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static String alarmClock(int day, boolean isVacay) {

        if ((day == 0 || day == 6) && isVacay) {
            return "off";
        } else if ((day > 0 && day < 6) && !isVacay) {
            return "7:00";
        } else {
            return "10:00";
        }
    }

    public static int blackjack(int first, int second) {

        if (first > 21 && second > 21) {
            return 0;
        } else {

            if (first > 21) {
                return second;
            } else if (second > 21) {
                return first;
            }

            if ((21 - first) > (21 - second)) {
                return second;
            } else {
                return first;
            }
        }
    }

    public static boolean evenlySpaced(int one, int two, int three) {

        int[] arr = new int[]{one, two, three};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr[1] - arr[0] == arr[2] - arr[1]) {
            return true;
        }
        return false;
    }
}
