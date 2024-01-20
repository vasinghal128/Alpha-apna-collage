/*
 
Butterfly pattern

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
import java.util.*;
public class pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number ");
        int r = sc.nextInt();
        //1ST HALF
        //OUTER LOOP
        for(int i=1; i<=r; i++){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int s =1; s<=2*(r-i);s++){
                System.out.print(" ");
            }
            // stars
            for(int o=1; o<=i; o++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        // outer loop
        for(int i= r; i>=1; i--){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int s =1; s<=2*(r-i);s++){
                System.out.print(" ");
            }
            // stars
            for(int o=1; o<=i; o++){
                System.out.print("*");
            }
            System.out.println();
        }
        
}
}
