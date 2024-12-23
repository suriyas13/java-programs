public class Main {
    public static void main(String[] args) {
        int n = 60;
        int m = 1000 * 18;
        int a = n * 5;
        System.out.println(m / a);
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
        if (str.equals(sb.reverse().toString())) {
            System.out.println("yes");
        } else {

            System.out.println("no");
        }
    }

}
