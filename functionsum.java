import java.util.*;
public class functionsum {
    //function define
    public static void sum(float num1, float num2){ // in peranthesis() num1 and num2 are perameters or formal perameters
        float sum = num1 + num2 ;
        System.out.print("Sum is"+" "+sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter your second number: ");
        float b = sc.nextFloat();
        sum(a, b); //function call
        // in peranthesis() a and b are argument or actual perameters
    }
}
