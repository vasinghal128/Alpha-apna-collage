import java.util.*;
public class multiplicationtable {
    public static void main(String args[]){
        int mul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            mul = n*i;
            System.out.println(mul);        }
    }
}
