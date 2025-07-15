public class avg {
    public static void main(String[] args) {
        int result =  average(6, 6, 6);
        System.out.println(result);
    }
    public static int average(int a, int b, int c){
       
        int avgs = (a + b + c) / 3;
        return avgs;
    }
}
