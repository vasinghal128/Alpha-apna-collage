import java.util.*;
public class bianrytodecimal {
    public static void binum(int num){
        int pow = 0;
        int mynum = num;
        int deci = 0;
        while(num>0){
            int lastdigit = num%10;
            deci = deci + (lastdigit*(int)Math.pow(2,pow));
            pow++;
            num = num/10;
        }
        System.out.println("Decimal of "+ mynum + " is " + deci);    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your binary ");
        int n = sc.nextInt();
        binum(n);
    }
}
