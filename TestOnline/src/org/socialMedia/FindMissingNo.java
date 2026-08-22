class Main {
    public static void main(String[] args) {

        int[] n = {8, 2, 6};

        // Bubble sort
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        // Find missing numbers
        for (int i = 0; i < n.length - 1; i++) {
            for (int k = n[i] + 1; k < n[i + 1]; k++) {
                System.out.println(k);
            }
        }
    }
}
