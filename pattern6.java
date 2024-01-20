/*

 inverted and roted half pyramid
    *
   **
  ***
 ****
*****

 */ 
import java.util.*;
public class pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row numbers: ");
        int r = sc.nextInt();
        // outer
        for(int i=1; i<=r; i++){
            // spaces
            for(int o = 1; o<=r-i;o++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}
