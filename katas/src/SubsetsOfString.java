import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SubsetsOfString {

    //{1,3,5,2,7} -> {7,2,5,3,1}
    public static void main(String[] args) {
        System.out.println(subset("abs", ""));
    }

    public static ArrayList<String> subset(String s, String result) {
        ArrayList<String> list = new ArrayList<>();
        if (s.isEmpty()){
            list.add(result);
            return list;
        }
        char c = s.charAt(0);
        ArrayList<String> left = subset(s.substring(1), result + c);
        ArrayList<String> right = subset(s.substring(1), result);

        left.addAll(right);
        return left;


    }


}
