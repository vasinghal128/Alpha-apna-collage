import java.util.*;
public class functionproduct {
    public static float mul(float num1, float num2){
        float mul = num1*num2;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        float a = sc.nextFloat();
        System.out.print("Enter Second first value: ");
        float b = sc.nextFloat();
        float mul = mul(a,b);
        System.out.println("product of "+a+"and "+b+"is "+mul);
    }
    
}
