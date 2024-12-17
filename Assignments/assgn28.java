import java.util.*;

public class assgn28 {
        public static boolean checkAnagram(String s1, String s2){
            if(s1.length() == s2.length()){
                char[] q1 = s1.toCharArray();
                char[] q2 = s2.toCharArray();

                Arrays.sort(q1);
                Arrays.sort(q2);

                if(Arrays.equals(q1,q2)){
                    System.out.println("Anagram");
                    return true;
                }
            }
            System.out.println("Not Anagram");
            return false;
        }

        public static void main(String[] args) {
            String s1 = "race";
            String s2 = "care";

            checkAnagram(s1, s2);
        }
}
