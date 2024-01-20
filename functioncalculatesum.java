import java.util.*;
public class functioncalculatesum{
    public static float calculatesum(float num1, float num2){
        float sum = num1 + num2 ;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter your second number: ");
        float b = sc.nextFloat();
        float sum = calculatesum(a, b);
        System.out.print("Sum is"+" "+sum);
    }
}