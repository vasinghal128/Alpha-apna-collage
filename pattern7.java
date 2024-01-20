/*

inverted half pyeramid with numbrd
12345
1234
123
12
1

 */
import java.util.*;
public class pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            // inner loop
            for(int j=1; j<=(r-i)+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
