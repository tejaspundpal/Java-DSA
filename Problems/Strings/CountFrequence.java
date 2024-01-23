package Java_DSA.Problems.Strings;

import java.util.HashMap;
import java.util.Map;

public class CountFrequence {
    public static void main(String[] args) {
        String inputString = "Java";
        Map<Character, Integer> charCountMap = new HashMap<>();
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}

