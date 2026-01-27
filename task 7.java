class UniqueDigitCount {
    static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Unique digits in 12321: " + uniqueDigitCount(12321));
        System.out.println("Unique digits in 1111: " + uniqueDigitCount(1111));
        System.out.println("Unique digits in 112233: " + uniqueDigitCount(112233));
        System.out.println("Unique digits in 9876543: " + uniqueDigitCount(9876543));
    }
}
