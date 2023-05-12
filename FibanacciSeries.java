import java.util.*;
public class FibanacciSeries {
    public static int fibanacciSeries(int n) {
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibanacciSeries(n -1) + fibanacciSeries(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        System.out.println(fibanacciSeries(n));
    }
}
