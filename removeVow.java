
import java.util.Scanner;


//     public static void main(String args[]){
        
//         String s = "antidisestablishmentarianism";

//         Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

//         StringBuilder result = new StringBuilder();

//         for(char c: s.toCharArray()){
//             if(!vowels.contains(c)){
//                 result.append(c);
//             }
//         }
//         System.out.println(result);
        
//     }
// }

public class removeVow{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String vowels = "aeiouAeiou";

        StringBuilder result = new StringBuilder();

        for(char c : input.toCharArray()){
            if(!vowels.contains(c+"")){
                result.append(c);
            }
        }
    
    System.out.println(result);

    }
}