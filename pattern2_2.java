/*
 ***** 
 ****
 ***
 **
 *
 */
import java.util.Scanner;

public class pattern2_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines numbers");
        int l = sc.nextInt();
        for(int i=1; i<=l; i++){
            for(int star=1;star<=(l-i)+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
