import java.util.Arrays;

public class ReverseWords {

    //atom -> mota
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split("\\s");
        int start = 0;
        int end = words.length-1;
        while(start < end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }


}
