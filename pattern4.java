import java.util.*;

// charater patterns
/*
 A
 BC
 DEF
 GHIJ
 KLMNO
 */
public class pattern4 {
    public static void main(String args[]){
      char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line numbets");
        int li = sc.nextInt();
        for(int i=1; i<=li; i++){
            for(int star=1; star<=i; star++){
                System.out.print(ch);
                    ch++;
            }
            System.out.println();
        }
   }
}
