import java.util.*;
public class displaynumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number");
            int num = sc.nextInt();
            if(num%10==0){
               continue;
            }
            System.out.println(num);
        }while(true);
    }
}