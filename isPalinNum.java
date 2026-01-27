class IsPalinNum {
    public int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if (rev == temp) return 1;  // Palindrome
        return 2;  // Not a palindrome
    }

    public static void main(String[] args) {
        IsPalinNum checker = new IsPalinNum();
        System.out.println("121 is palindrome: " + checker.isPalinNum(121));
        System.out.println("123 is palindrome: " + checker.isPalinNum(123));
        System.out.println("1221 is palindrome: " + checker.isPalinNum(1221));
        System.out.println("1234 is palindrome: " + checker.isPalinNum(1234));
    }
}
