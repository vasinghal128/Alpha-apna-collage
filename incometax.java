import java.util.*;

/*
income<5l
0% tax

income between 5-10l
20%tax

income>10l
30%tax

 */

public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income ");
        int income = sc.nextInt();
        float incometax;
        if(income<500000){
            System.out.println("There is no income tax");
        }
        else if(income>=500000 && income<1000000){
            System.out.println("There is 20% income tax");
            incometax = (income*20)/100;
            System.out.print("Tax you must pay is " + incometax);
        }
        else{
            System.out.println("There is 30% income tax");
            incometax = (income*30)/100;
            System.out.print("Tax you must pay is " + incometax);
        }
    }
    
}
