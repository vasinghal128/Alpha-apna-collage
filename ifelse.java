import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:-> ");
        int age = sc.nextInt();
        if(age>18){
            System.out.print("You are adult You can vote, drive ");
        }
        else if(age>=13 && age<=18){
            System.out.print("You are teenager you think about drive and vote but you can't vote and drive");
        }
        else{
            System.out.print("You are Kid You can not even think about vote, drive ");
        }
    }
}
