package Task50;

public class PalindromicWord {

    static  boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("see"));
        System.out.println(isPalindrome2("eye"));
    }
}
