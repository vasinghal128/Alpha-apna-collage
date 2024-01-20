import java.util.*;
public class binomenal_coffecient {
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
    public static int bc(int n,int r ){
        int nfac = fact(n);
        int rfac = fact(r);
        int nrfac = fact(n-r);
        int bc = nfac/(rfac*nrfac);
        return bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        System.out.print("Enter Your number: ");
        int r = sc.nextInt();
        int bc = bc(num,r);
        System.out.println("Binominal cofficent is "+bc);
}
}
