
import java.util.Scanner;


// import java.util.Scanner;

// public class fibb{
//     public static void main(String[] args) {
        
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     int firstNum = 0;
//     int secNum = 1;
//     int nextNum;

//     for(int i = 1; i<=n;i++){
//         System.out.print(firstNum + " ");
//         nextNum = firstNum + secNum;
//         firstNum = secNum;
//         secNum = nextNum;
//     }
//     }
// }

//recursive

public class fibb{

    public static int fibbo(int n){
       if(n <=1){
        return n;
       }
       else{
        return fibbo(n-1) + fibbo(n-2);
       }
    }

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();


       for(int i = 0; i <= n; i++){
        System.out.print(fibbo(i) + " ");
       } 
    }
}