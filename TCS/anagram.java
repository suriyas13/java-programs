public class anagram {
    public static void main(String[] args) {
        String a = "eat";
        String b = "tea";
        int[] a1 = new int[26];
        int[] b1 = new int[26];
        for (char x : a.toCharArray()) {
            a1[x - 'a']++;
        }
        for (char x : b.toCharArray()) {
            b1[x - 'a']++;
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (b1[i] != a1[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Not anagram");
        } else {
            System.out.println("Anagram");
        }
    }
}
