public class functionoverloadingperameters {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(10,50));
        System.out.println(sum(10,20,30));
    }
    
}
