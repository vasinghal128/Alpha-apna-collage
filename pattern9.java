/*

 0-1 tringle
 1
 01
 101
 0101
 10101

 */
import java.util.*;
public class pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
