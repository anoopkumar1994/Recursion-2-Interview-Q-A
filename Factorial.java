import java.util.Scanner;


public class Factorial{
    public static int factorial(int num) {
        int result = 0;
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            result = num * factorial(num -1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();

        System.out.println(factorial(num));
    }
}