/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */


public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome(" asdDSA"));
    }
    public static boolean isPalindrome(String s) {
        s = convert(s);

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() -1 -i)){
                return false;
            }
        }
        return true;
    }

    private static String convert(String s){
        s =s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch =s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <='9')){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
