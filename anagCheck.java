import java.util.Arrays;
class anagCheck {
    public static void main(String[] args) {
        String a = "east";
        String b = "seafjt";
        
        System.out.println(isAna(a,b));
        
    }
       static boolean isAna(String a, String b){
            if(a.length() != b.length()){
                return false;
            }
            
            char ab[] = a.toCharArray();
            char ba[] = b.toCharArray();
            
            Arrays.sort(ab);
            Arrays.sort(ba);
            
            return Arrays.equals(ab, ba);
    }
}
