import java.util.*;
public class ternaryoprator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int num = sc.nextInt();
        // ternary oprator
        String evenodd = num%2==0?"even":"odd";
        System.out.print(evenodd);
    }
}
