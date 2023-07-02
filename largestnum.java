import java.util.*;
public class largestnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:- ");
        float a = sc.nextFloat();
        System.out.print("Enter your second number:- ");
        float b = sc.nextFloat();
         System.out.print("Enter your Third number:- ");
        float c = sc.nextFloat();
        if(a>=b && a>=c){
            System.out.print("Largest number is"+a);
        }
        else if(b>=a && b>=c){
            System.out.print("Largest number is"+b);
        }
        else{
            System.out.print("Largest number is"+c);
        }
    }
}
