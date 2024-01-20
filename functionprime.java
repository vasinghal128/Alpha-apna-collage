import java.util.*;
public class functionprime {
    public static void prime(int n){
        boolean isprime = true;
        if(n==2 || n==1){
            isprime = true;
        }
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime == false){
            System.out.print(n+" is not a prime number ");
        }
        else{
                System.out.print(n+" is a prime number ");
                
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int n = sc.nextInt();
        prime(n);
    }   
}
