import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number ");
        float a = sc.nextFloat();
        System.out.print("Enter your second number ");
        float b = sc.nextFloat();
        System.out.println("Enter your oprator ");
        System.out.println(" + for Addition (a+b)");
        System.out.println(" - for substraction (a-b)");
        System.out.println(" * for multiplication (a*b)");
        System.out.println(" / for dividation (a/b)");
        System.out.println(" % for reminder (a%b)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition of a and b (a+b) is" + (a + b));
                break;
            case '-':
                System.out.println("Sustraction of a and b (a-b) is" + (a - b));
                break;
            case '*':
                System.out.println("multiplication of a and b (a*b) is" + (a * b));
                break;
            case '/':
                System.out.println("Dividation of a and b (a/b) is" + (a / b));
                break;
            case '%':
                System.out.println("Reminder of a and b (a%b) is" + (a % b));
                break;
        }
    }
}
