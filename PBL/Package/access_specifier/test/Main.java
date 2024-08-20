public class Main {
    public static void main(String[] args) {
        Foundation f = new Foundation(10, 20, 30, 40);

        /* Foundation Package */
        // System.out.println(f.var1); error when access in test package
        System.out.println(f.var2);
        System.out.println(f.var3);
        System.out.println(f.var4);

    }
}
