/*
 Palindromic pyramid
    1
   212
  32123
 4321234
543212345
 */
import java.util.*;
public class pattern15 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row numbers: ");
        int r = sc.nextInt();
        // rows
        for(int i=1; i<=r; i++){
        // spaces
            for(int s=1; s<=r-i; s++){
                System.out.print(" ");
            }
            // dsending numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // asending number
            for(int m=2; m<=i; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
