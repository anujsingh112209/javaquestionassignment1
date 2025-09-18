public class PalindromeCheck1 {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "12321";
        System.out.println("Is " + s1 + " palindrome? " + isPalindrome(s1, 0, s1.length() - 1));
        System.out.println("Is " + s2 + " palindrome? " + isPalindrome(s2, 0, s2.length() - 1));
    }
}



