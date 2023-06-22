import java.util.*;
public class typecasting {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // float a = sc.nextInt(); -> widely type conversion(short to bigger storage)
        float a = sc.nextFloat();
        int b = (int)(a); // -> narrowing or expliting type conversion(bigger to short storage)
        // int b = a; it give a lossy conversion error
        System.out.println(b);
        char ch1 = 'c';
        char ch2 = 'd';
        int number1 = ch1; // it will be convert character ascai values
        int number2 = ch2;
        System.out.println(number1); // it will print character asci values
        System.out.println(number2);
    }
}
