/* 
Hollow Ractangle
 *****
 *   *
 *   *
 *****
 */
import java.util.*;
public class pattern5 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your row number");
       int nor = sc.nextInt();
       System.out.print("Enter your colume number");
       int noc = sc.nextInt();
       //outer looop for rows
       for(int i=1 ;i<=nor;i++){
            for(int j=1;j<=noc;j++){
                if(i==1 || i==nor || j==1 || j==noc){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
        }    
    }
