public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("atom"));
        System.out.println(isPalindrome("globigerinas"));
        System.out.println(isPalindrome("Madam, I'm Adam."));
        System.out.println(isPalindrome("Sit on a potato pan, Otis."));
        System.out.println(isPalindrome("Able was I, ere I saw Elba."));
    }

    public static boolean isPalindrome(String s) {
        s = s.trim();
        s = s.replaceAll("[\\'|\"|\\.|\\,|\\s]", "");
        return reverse(s).equalsIgnoreCase(s);
    }
    public static String reverse(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] result = new char[s.length()];

        while(start <= end){
            result[start] = s.charAt(end);
            result[end] = s.charAt(start);
            start++;
            end--;
        }
        String str = new String(result);
        System.out.println(str);
        return str;
    }


}
