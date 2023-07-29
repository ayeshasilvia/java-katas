import java.util.Arrays;

public class StringSkipA {

    //{1,3,5,2,7} -> {7,2,5,3,1}
    public static void main(String[] args) {
        skip("baacbdds", "");
    }

    public static void skip(String s, String result) {
        if (s.isEmpty()){
            System.out.println(result);
            return;
        }
        char c = s.charAt(0);
        if (c == 'a'){
            skip(s.substring(1), result);
        } else {
            skip(s.substring(1), result + c);
        }

    }


}
