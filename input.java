import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String Name = sc.next(); :- it is use for before the space
        // System.out.print(Name);
         String name = sc.nextLine();  //it is use for after space and also for afer new line
        System.out.println(name);
        int number = sc.nextInt();  //it is use for integer number
        System.out.println(number);
        float fnumber = sc.nextFloat(); // it is use for float number
        System.out.println(fnumber);
        boolean boo = sc.nextBoolean(); // it is for bollen value
        System.out.println(boo);
    }    
}
