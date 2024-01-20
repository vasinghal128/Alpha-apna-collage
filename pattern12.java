/*
hollow rohmbous
    *****
   *   *
  *   *
 *   *
*****

 */
import java.util.*;
public class pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number ");
        int r = sc.nextInt();
        // outer loop
        for(int i=1; i<=r; i++){
            //spaces
            for(int s=1;s<=r-i;s++){
                System.out.print(" ");        
            }
            // stars
            for(int j=1;j<=r;j++){
                if(i==1||i==r||j==1||j==r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       

    }
}
