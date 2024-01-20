import java.util.*;
public class fuunctionprimeinrange {
    public static void isprime(int num){
        System.out.println("2");
        for(int i=2; i<=num; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number ");
        int n = sc.nextInt();
        isprime(n);
    }
}
