class SecondWordUpper {
    static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Input: \"Hello World\"");
        System.out.println("Output: " + secondWordUpper("Hello World"));
        
        System.out.println("\nInput: \"Java Programming Language\"");
        System.out.println("Output: " + secondWordUpper("Java Programming Language"));
        
        System.out.println("\nInput: \"Single\"");
        System.out.println("Output: " + secondWordUpper("Single"));
        
        System.out.println("\nInput: \"The Quick Brown Fox\"");
        System.out.println("Output: " + secondWordUpper("The Quick Brown Fox"));
    }
}
