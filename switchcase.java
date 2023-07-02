import java.util.*;
public class switchcase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("press your switch");
        System.out.println("1 switch for samosa");
        System.out.println("2 switch for Burger");
        System.out.println("3 switch for Mango shake");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Here is your Samosa");
                    break;
            case 2: System.out.println("Here is your Burger");
                    break;
            case 3: System.out.println("Here is your Mango shake");
                    break;
            default: System.out.println("you wake up");
        }
    }
}
