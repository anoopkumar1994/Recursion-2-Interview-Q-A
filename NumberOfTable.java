import java.util.Scanner;

public class NumberOfTable {
    public static void numOfTable(int n, int t) {
        if(t == 1){
            System.out.println(n);
            return ;
        }
        else{
            numOfTable(n, t-1);
            System.out.println(n*t);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = s.nextInt();
        System.out.println("Enter iterate target number :");
        int t = s.nextInt();

       numOfTable(n,t);
       
    }
    
}
