/*
 ***** 
 ****
 ***
 **
 *
 */
import java.util.*;
public class pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines numbers");
        int l = sc.nextInt();
        for(int i=1; i<=l; i++){
            for(int star=l; star>=i; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
