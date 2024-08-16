public class odd_even {
    public static void main(String[] args) {
        String s = "123456";
        char[] c = s.toCharArray();
        int i = 0, j = 1;
        while (i < s.length() && j < s.length()) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i = i + 2;
            j = j + 2;
        }
        System.out.println(c);
    }
}
