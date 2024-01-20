/*

 Floyd's tringle
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */
import java.util.*;
public class pattern8 {
   public static void main(String args[]){
    int o = 1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your rowes ");
    int r = sc.nextInt();
    for(int i=1; i<=r; i++){
        // inner - how many timewill o be printed
        for(int j=1; j<=i; j++){
            System.out.print(o+" ");
            o++;
        }
        
        System.out.println();
    }
}
}