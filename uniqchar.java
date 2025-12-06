import java.util.Map;
import java.util.HashMap;


class uniqchar{
    public static void main(String a[]){
        String s = "aabbbccfkk";

        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c: s.toCharArray()){
            if(map.get(c) ==1){
                int innn = s.indexOf(c);
                System.out.println(c + " at the index of " +innn);
                return;

            }
        }

    }
}