import java.util.*;

 class SumOfDigit{
    public static int sumOfDigit(int n) {
        if(n == 0){
            return n;
        }else{
            return n%10 + sumOfDigit(n/10);
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        System.out.println(sumOfDigit(n));

    }
}