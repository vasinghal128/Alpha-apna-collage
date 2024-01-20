    import java.util.*;
    public class evenoddsum {
        public static void main(String args[]){
            int evensum=0;
            int oddsum=0;
            int p;
            Scanner sc = new Scanner(System.in);
            do{
            System.out.print("Enter your number ");
            int n = sc.nextInt();
            if(n%2==0){
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            System.out.print("If you want to continue press 1 or you quit press 0 ");
            p = sc.nextInt();
    }while(p == 1);
    System.out.println("Sum of Even numbers is" +" "+evensum);
    System.out.println("Sum of odd numbers is" +" "+oddsum);
}
    }