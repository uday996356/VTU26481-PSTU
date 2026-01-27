class MostFrequentDigit {
    static int mostFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println("Most frequent digit in 112233: " + mostFrequentDigit(112233));
        System.out.println("Most frequent digit in 1234567: " + mostFrequentDigit(1234567));
        System.out.println("Most frequent digit in 5555: " + mostFrequentDigit(5555));
        System.out.println("Most frequent digit in 121212: " + mostFrequentDigit(121212));
    }
}
