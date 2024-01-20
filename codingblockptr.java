import java.util.*;

public class codingblockptr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int a = num -2;
        for (int i = 0; i < num-2; i++) {
            if(num/2-i+1==0){
                break;
            }
            if (i == 0) {
                System.out.println("*".repeat(num));
            } else {
                System.out.println("*".repeat(num/2-i+1) + " ".repeat(2 * i - 1) + "*".repeat(num/2-i+1));
            }
            if(num/2-i+1==0){
                break;
            }
        }
        for (int i = num-4; i >= 0; i--) {
            if(num/2-i+1<2){
                continue;
            }
            if (i == 0) {
                System.out.println("*".repeat(num));
            } else {
                System.out.println("*".repeat(num/2-i+1) + " ".repeat(2 * i - 1) + "*".repeat(num/2-i+1));
            }
        }
    }
}
