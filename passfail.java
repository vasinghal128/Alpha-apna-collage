import java.util.*;
public class passfail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ");
        int marks = sc.nextInt();
        String pf = marks>33?"pass":"fail";
        System.out.println(pf);
    }    
}
