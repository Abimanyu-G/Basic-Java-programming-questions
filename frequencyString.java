
import java.util.HashMap;
import java.util.Map;

class frequencyString{
    public static void main(String a[]){
        String word = "Abimanyu";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : word.toLowerCase().toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
            else{
               map.put(c, map.get(c)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
          System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}