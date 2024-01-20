import java.util.*;
public class factorial {
    public static void main(String args[]){
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = sc.nextInt();
        do{
            factorial*=n;
            n = n-1;
        }while(n!=0);
        System.out.print("factorial is" +" "+ factorial);
    }    
}
