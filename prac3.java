
public class prac3 {
    public static void main(String[] args) {
        int num = 10899;
        while (num > 0) {
            int ld = num % 10;
            System.out.print(ld);
            num=num/10;
        }
     System.out.println();  
    }
}
