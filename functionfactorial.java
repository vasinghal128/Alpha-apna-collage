import java.util.*;
public class functionfactorial {
    public static int fact(int n){
        int f = 1;
        do{
            f*=n;
            n--;
        }while(n!=0);
        if(f==0){
           return 1;
        }
        return f ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of "+num +" is "+factorial);
    }    
}
