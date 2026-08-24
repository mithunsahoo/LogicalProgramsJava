class SwapFirstWithLast {
    public static void main(String[] args) {
        int n = 19992;
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();

        // swap first and last
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        int result = Integer.parseInt(new String(arr));
        System.out.println(result);
    }
}
