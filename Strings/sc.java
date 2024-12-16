public class sc {
    public static String stringCompression(String s){
        String newst = "";
        for(int i=0; i<s.length(); i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            newst += s.charAt(i);
            if(count > 1){
                newst += count.toString();
            }
        }
        return newst;
    }
    public static void main(String[] args) {
        String s = "aaabbssddcc";

        System.out.println(stringCompression(s));
    }
}
