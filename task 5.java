class CountPrimesInRange {
    public int countPrimesInRange(int input1, int input2) {
        int d = input1;
        int i;
        int c = 0;
        int cou = 0;
        
        while (d <= input2) {
            for (i = 2; i < d; i++) {
                if (d % i == 0) {
                    c++;
                }
            }
            if (c == 0) {
                cou++;
                System.out.println(d);
            }
            d++;
            c = 0;
        }
        return cou;
    }

    public static void main(String[] args) {
        CountPrimesInRange primeCounter = new CountPrimesInRange();
        System.out.println("Primes between 10 and 30:");
        int count = primeCounter.countPrimesInRange(10, 30);
        System.out.println("Total primes found: " + count);
    }
}
