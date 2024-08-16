class creating_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[{1,2,3,4,5}];
        String[] str = new String[{"SUriya","tu","ch","ka","ni"}];
        for (int i = 0; i < 5; i++) {
            // arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            System.out.println(str[i]);
        }
        // for (int i = 0; i < 5; i++) {
        // str[i] = sc.next();
        // }
    }
}