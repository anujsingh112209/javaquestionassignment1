public class ReverseString {
    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "java";
        String result = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}



