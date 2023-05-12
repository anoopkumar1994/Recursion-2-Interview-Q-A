import java.util.Scanner;

public class CountStairsWays {
    public static int countWays(int n) {
        int result = 0;
        if(n == 0 || n == 1){
            return n;
        }
        else{
            result = countWays(n-1) + countWays(n-2);
            return result;
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        
        int result = countWays(n+1);
        System.out.println("Count of stairs " + result + " ways");
    }
}
