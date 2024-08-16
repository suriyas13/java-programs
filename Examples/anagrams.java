import java.util.Scanner;

public class anagrams{

        static boolean isAnagram(String a, String b) {
        String str1 = a.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String str2 = b.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if lengths are equal after removing non-alphabetic characters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Count the frequency of each character in both strings
        int[] count = new int[26]; // Assuming only English alphabetic characters
        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }

        // If all counts are zero, then strings are anagrams
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}