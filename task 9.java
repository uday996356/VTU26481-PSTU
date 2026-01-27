class SumNonPrimeIndex {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int sumNonPrimeIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Array: {10, 20, 30, 40, 50, 60, 70}");
        System.out.println("Sum at non-prime indices: " + sumNonPrimeIndex(arr1));
        
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nArray: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}");
        System.out.println("Sum at non-prime indices: " + sumNonPrimeIndex(arr2));
    }
}
