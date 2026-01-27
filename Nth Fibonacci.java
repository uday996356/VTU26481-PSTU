class NthFibonacci {
    public long nthFibonacci(int input1) {
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 3;
        while (d <= input1) {
            c = a + b;
            a = b;
            b = c;
            d++;
        }
        return c;
    }

    public static void main(String[] args) {
        NthFibonacci fib = new NthFibonacci();
        System.out.println("5th Fibonacci: " + fib.nthFibonacci(5));
        System.out.println("10th Fibonacci: " + fib.nthFibonacci(10));
        System.out.println("15th Fibonacci: " + fib.nthFibonacci(15));
    }
}
