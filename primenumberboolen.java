import java.util.*;
public class primenumberboolen {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter oyur number to check this is prime or not ");
            int n = sc.nextInt();
            boolean isprime = true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.print(n+" "+"is a prime number");
            }
            else{
                    System.out.print(n+" "+"is not a prime number");
            }
                   
    }
    
}

    

