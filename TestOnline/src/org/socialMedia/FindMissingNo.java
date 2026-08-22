class FindMissingNo {
    public static void main(String[] args) {

        int[] n = {2, 6, 8};

        for (int i = 0; i < n.length - 1; i++) {
            int next = n[i] + 1;

            while (next < n[i + 1]) {
                System.out.println(next);
                next++;
            }
        }
    }
}
