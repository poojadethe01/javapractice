package method;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewQL {

	//public static void main(String[] args) {
	
		 public static Object wordFrequencies(String text) {
		        // Regex to extract only words (ignore numbers & symbols)
		        Pattern pattern = Pattern.compile("[A-Za-z]+");
		        Matcher matcher = pattern.matcher(text);

		        Map<String, Integer> freqMap = new LinkedHashMap<>();
		        Map<String, String> originalCaseMap = new HashMap<>();

		        while (matcher.find()) {
		            String word = matcher.group();
		            if (word.length() > 3) {
		                String lower = word.toLowerCase();

		                // Store original case (first occurrence)
		                originalCaseMap.putIfAbsent(lower, word);

		                freqMap.put(lower, freqMap.getOrDefault(lower, 0) + 1);
		            }
		        }

		        if (freqMap.isEmpty()) {
		            return "No Salt";
		        }

		        // Build final map with original case
		        Map<String, Integer> finalMap = new LinkedHashMap<>();
		        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
		            String originalWord = originalCaseMap.get(entry.getKey());
		            finalMap.put(originalWord, entry.getValue());
		        }

		        return finalMap;


	}

}
