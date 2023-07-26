import java.util.Arrays;

public class ReverseString {

    //atom -> mota
    public static void main(String[] args) {
        System.out.println(solution("atom"));
        System.out.println(solution("attention"));
    }

    public static String solution(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] result = new char[s.length()];

        while(start <= end){
            result[start] = s.charAt(end);
            result[end] = s.charAt(start);
            start++;
            end--;
        }

        return new String(result);
    }


}
