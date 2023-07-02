import java.util.*;
public class logicaloprators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A:- ");
        int A = sc.nextInt();
        System.out.print("Enter value of B:- ");
        int B = sc.nextInt();
        System.out.println(A==B && A==20);
        System.out.println(A==B || A<B);
        System.out.print(!(A==B));
    
    }
}