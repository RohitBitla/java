import java.util.*;
public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int prod= multiply(a, b);
       System.out.println(prod);
       System.out.println(multiply(144, 122));
       

    }
    public static int multiply(int a , int b){
        
        int sum = a*b;

        return sum;
    }
}
