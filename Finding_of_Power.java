import java.util.Scanner;
import java.math.*;

public class Finding_of_Power {
    public static int findingOfPower(int n, int m) {
        if(n == 1){
            return m;
        }
        else{
            return m * findingOfPower(n-1, m);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a power number: ");
        int n = s.nextInt();
        System.out.println("Enter a number: ");
        int m = s.nextInt();

        System.out.println(findingOfPower(n, m));
    }
    
}





















