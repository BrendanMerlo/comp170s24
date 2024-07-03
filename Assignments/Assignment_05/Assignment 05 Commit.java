public class A05 {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) { 
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // expect true;
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // expect true
        System.out.println(isPalindrome("Java")); // expect false
    } // method main
}
