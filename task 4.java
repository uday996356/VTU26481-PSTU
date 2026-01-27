class AddLastDigits {
    public int addLastDigits(int input1, int input2) {
        if (input1 < 0)
            input1 = (-1) * input1;
        if (input2 < 0)
            input2 = (-1) * input2;
        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {
        AddLastDigits adder = new AddLastDigits();
        System.out.println("123 + 456: " + adder.addLastDigits(123, 456));
        System.out.println("789 + 321: " + adder.addLastDigits(789, 321));
        System.out.println("-123 + 456: " + adder.addLastDigits(-123, 456));
        System.out.println("-789 + -321: " + adder.addLastDigits(-789, -321));
    }
}
