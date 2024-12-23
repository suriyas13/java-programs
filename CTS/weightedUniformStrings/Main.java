import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "Programming";
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeated characters
        for (char ch : input.toCharArray()) {
            if (charCount.get(ch) == 1) {
                System.out.print(ch);
            }
        }
    }
}
