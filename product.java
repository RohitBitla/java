import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       System.out.println(productofTwo( a, b));
    }
    public static  int productofTwo(int a,int b) {
    
       return a * b;
        
    }
}
