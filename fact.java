public class fact {
    public static void main(String[] args) {
        System.out.println(binoCoeff(5, 2));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));

    }
    public static int factorial (int n){
        int f = 1;
        for(int i=1;i<=n; i++){
            f=f*i;
           
        }
        return f;
    }
    public static int binoCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int mnr = factorial(n-r);
        int bc = fact_n/(fact_r*mnr);
        return bc;
    }
    public static int sum(int a ,int b){
        return a + b;
    }
    public static int sum ( int a , int b, int c){
        return a + b + c;
    }
}
