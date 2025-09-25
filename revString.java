public class revString{
    public static void main(String args[]){
        String word = "abimanyu";
        String reversed = "";
        char ch;

        for(int i = 0; i<word.length(); i++){
            ch = word.charAt(i);
            reversed = ch + reversed;
        }
        System.out.println(reversed);
    }
}