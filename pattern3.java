// Half pyramid
/*
 1
 12
 123
 1234
 12345
 */
import java.util.*;
public class pattern3 {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line numbets");
        int li = sc.nextInt();
        for(int i=1; i<=li; i++){
            for(int star=1; star<=i; star++){
                System.out.print(star);
            }
            System.out.println();
        }
   }
}
