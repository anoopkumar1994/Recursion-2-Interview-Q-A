import java.util.*;
import java.math.*;
public class PowerOfBigger {
    public static BigInteger findingOfPower(BigInteger n, int m) {
        BigInteger result, finalresult;
        //Base Condition
         if(m == 1){
            return n;       
        }
        //recursive function call
        else{
            result = findingOfPower(n, m/2);
            finalresult = result.multiply(result);
            if(m % 2 == 0){
                return finalresult;
            }else{
                return n.multiply(finalresult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a anumber: ");
        BigInteger n = s.nextBigInteger();
        System.out.println("Enter a power number: ");
        int m = s.nextInt();
    
        System.out.println(findingOfPower(n, m));
    }
}
