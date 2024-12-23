class Main {
    public static void main(String[] args) {
        String s = "Always-Look-on-the-Bright-Side-of-Life";
        StringBuilder sb = new StringBuilder();
        int n = 5;
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int a = (int) c;
                if ((a + n) <= 122) {
                    sb.append((char) (a + n));
                } else {
                    int b = 96;
                    b += ('z' - a);
                    int d = n - b;
                    sb.append((char) (96 + d));
                }
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        System.out.println(('m' - 'a') + 1);
        System.out.println((char) ('a' + 5));
    }
}