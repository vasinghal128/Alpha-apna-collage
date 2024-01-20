/*
* 
**
***
****
*****
 */
import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines number: ");
        int l = sc.nextInt();
        for(int i=1; i<=l; i++){
            for(int str=1; str<=i; str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

