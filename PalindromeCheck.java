
public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "Madam";

        Boolean result = isPalindrome(str);

        if(result){
            System.out.print("Yes, its Palindrome");
        }
        else{
            System.out.println("No, its not Palindrome");
        }
    }
    
    public static boolean isPalindrome(String s){
        s  = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
