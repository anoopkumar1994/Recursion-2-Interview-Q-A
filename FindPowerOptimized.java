import java.util.Scanner;

public class FindPowerOptimized {
    public static long optimizedPower(long a, int b) {
        long result,finalresult;

        if(b == 1){
            return a;
        }
        else{
            result = optimizedPower(a, b/2);
            finalresult = result * result;
            if(b % 2 == 0){
                return finalresult;
            }else{
                return a * finalresult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a numbre");
        long a = s.nextLong();
        System.out.println("Enter power of number");
        int b = s.nextInt();

        System.out.println(optimizedPower(a, b));
    }
}
