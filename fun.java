import java.util.*;
public class fun {
public static void ph(){
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    return ;
}
public static int calsum(int num1 , int num2){
    
    
    int sum = num1 + num2;
    return sum;
   
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
       int sum = calsum( a,b);
       System.out.println(sum);
    }
}
