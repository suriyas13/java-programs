class removeduplicate {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j < i + 1; j++) {

                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
