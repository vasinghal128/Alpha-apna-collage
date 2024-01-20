/*
diamond
    *
   ***
  *****
 *******
 *******
  *****
   ***
    *
 */
import java.util.*;
public class pattern13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number ");
        int r = sc.nextInt();
        // outer loop
        for(int i=1; i<=r; i++){
            // spaces
            for(int s=1;s<=r-i;s++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
}
//2nd half
for(int i=r;i>=1;i--){
    // spaces
    for(int s=1;s<=r-i;s++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
}
    }
}