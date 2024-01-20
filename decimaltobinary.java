import java.util.*;
public class decimaltobinary {
    public static void db(int num){
        int mynum = num; 
       int pow = 0;
       int binum = 0;
       while(num>0){
        int rem = num%2;
        binum = binum+(rem*(int)Math.pow(10,pow));
        pow++;
        num = num/ 2;
       }
        System.out.println("binary of "+ mynum + " is " + binum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = sc.nextInt();
        db(n);    
    }    
}
