package array;

import java.util.*;

public class A {

    public static void main(String[] args) {

        String input = "Paracetamol 650 mg + Dolo 650 + Midotab 2.5 mg + Midotab 5 mg + Paracetamol 500 mg + Urimax 4 mg + Dolo 500 + Urimax 2";
        System.out.println("Result:\n" + returnString(input));
    }

    public static String returnString(String tablets) {
        if (tablets == null || tablets.trim().isEmpty()) {
            return "No Salt";
        }

        String[] words = tablets.split("\\s+");   // split by spaces
        Map<String, Integer> freqMap = new LinkedHashMap<>(); // maintain insertion order

        for (String word : words) {
            // remove unwanted symbols (numbers, +, . etc.)
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > 3) {
                // Normalize word (capitalize first letter)
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        if (freqMap.isEmpty()) {
            return "No Salt";
        }

        // Build result string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }

        return sb.toString().trim();
    }
}
