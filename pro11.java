import java.util.HashMap;
import java.util.Map;

public class pro11 {
    public static void main(String[] args) {
        // Check if the user has provided a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        // Get the input string from command-line argument
        String input = args[0];
        
        // HashMap to store the frequency of letters and digits
        Map<Character, Integer> letterFrequency = new HashMap<>();
        Map<Character, Integer> digitFrequency = new HashMap<>();

        // Traverse through the string and count frequency of letters and digits
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Count letter frequencies (case insensitive)
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Make it case insensitive
                letterFrequency.put(ch, letterFrequency.getOrDefault(ch, 0) + 1);
            }
            // Count digit frequencies
            else if (Character.isDigit(ch)) {
                digitFrequency.put(ch, digitFrequency.getOrDefault(ch, 0) + 1);
            }
        }

        // Display the frequency of letters
        System.out.println("Letter Frequencies:");
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Display the frequency of digits
        System.out.println("Digit Frequencies:");
        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
