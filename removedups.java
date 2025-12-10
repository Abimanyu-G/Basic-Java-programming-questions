
import java.util.HashSet;
class removedups {
    public static void main(String[] args) {
        int nu[] = {2, 4, 5, 5, 7, 8, 9,9};
        
        HashSet<Integer> map = new HashSet<>();
        for(int n : nu){
            if(!map.contains(n)){
                map.add(n);
            }
        }
        System.out.println(map);
    }
}
