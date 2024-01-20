/*
 solid rombes
    *****
   *****
  *****
 *****
*****
 */
import java.util.*;
public class pattern11 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number ");
        int r = sc.nextInt();
        // outer loop
        for(int i=1; i<=r; i++){
            for(int s=1; s<=r-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=r; j++){
                System.out.print("* ");
            }
            System.out.println();
}
     }
    }