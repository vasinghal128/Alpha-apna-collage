import java.util.*;
public class functionswap {
    public static void swap(float a,float b){
        float c = a;
        a = b;
        b = c;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The valu of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter The valu of b: ");
        float b = sc.nextFloat();
        swap(a,b);
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }    
}
