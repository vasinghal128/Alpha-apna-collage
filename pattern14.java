/*
 Number pyramid
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
import java.util.*;
public class pattern14 {
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
            // numbers
            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
