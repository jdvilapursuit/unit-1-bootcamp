
import java.util.*;

public class DataStructures {

    public static void main(String args[]) {

        ArrayList<Cat> smellyCats = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            smellyCats.add(new Cat("smellyCat#" + (i + 1)));
            System.out.println(smellyCats.get(i).getName());
        }

        HashMap<String, Integer> groupHashMap = new HashMap<>();
        groupHashMap.put("Caroline", 28);
        groupHashMap.put("Linda", 28);
        groupHashMap.put("Danny", 28);
        groupHashMap.put("Sanje", 34);

        for (Map.Entry<String, Integer> e : groupHashMap.entrySet()) {
            System.out.println(e);
        }
        sortSentence("hello my name is daniel");
    }

    public static void mostFrequentElement(ArrayList<Integer> arrayList) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!record.containsKey(arrayList.get(i))) {
                record.put(arrayList.get(i), 1);
            } else {
                record.put(arrayList.get(i), record.get(arrayList.get(i)) + 1);
            }
        }
        Map.Entry<Integer, Integer> most = null;
        for (Map.Entry<Integer, Integer> e : record.entrySet()) {
            if (most == null || e.getValue() > most.getValue()) {
                most = e;
            }
        }
        System.out.println(most);
    }

    public static boolean canRentACar(HashMap<String, Integer> Pod) {
        boolean canRent = false;
        for (String student : Pod.keySet()) {
            if (Pod.get(student) > 25) {
                canRent = true;
            }
        }
        return canRent;
    }

    public static ArrayList<String> wordsWithoutList(String[] strArr, int x) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : strArr) {
            if (s.length() != x) {
                result.add(s);
            }
        }
        return result;
    }

    public static int countClumps(ArrayList<Integer> integerArrayList) {
        int count = 0;
        boolean lessThanTwoSame = true;

        for (int i = 0; i < integerArrayList.size() - 1; i++) {
            if (lessThanTwoSame && integerArrayList.get(i).equals(integerArrayList.get(i + 1))) {
                lessThanTwoSame = false;
                count++;
            }
            if (!integerArrayList.get(i).equals(integerArrayList.get(i + 1))) {
                lessThanTwoSame = true;
            }
        }
        return count;
    }

    public static void sortSentence(String sentence) {
        String[] sentenceArr = sentence.split("[^a-zA-Z']+");
        Arrays.sort(sentenceArr);
        for (String s : sentenceArr) {
            System.out.println(s);
        }
    }

    public static void sortSentenceTwo(String sentence) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String substring = sentence;
        int tracker = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') {
                stringArrayList.add(substring.substring(tracker,i));
                tracker = i+1;
            }else if (i == sentence.length()-1) {
                stringArrayList.add(substring.substring(tracker));
            }
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            for (int j = i+1; j < stringArrayList.size(); j++) {
                if(stringArrayList.get(i).charAt(0) > stringArrayList.get(j).charAt(0)) {
                    String temp = stringArrayList.get(i);
                    stringArrayList.set(i,stringArrayList.get(j));
                    stringArrayList.set(j,temp);
                }
            }
        }

        for(String s : stringArrayList) {
            System.out.println(s);
        }

    }
}
