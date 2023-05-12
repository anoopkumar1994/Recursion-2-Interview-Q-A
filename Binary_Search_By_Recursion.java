
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_By_Recursion {
    public static int binarySearch(int arr[], int low, int high, int target) {
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                return binarySearch(arr, mid + 1, high,target);
            }
            else{
                return binarySearch(arr, low, mid-1, target);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements :");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter searching element ");
        int target = s.nextInt();

        int low = 0;
        int high = arr.length-1;

        int findValue = binarySearch(arr, low, high, target);
        if(findValue == -1){
            System.out.println("element not found " + -1);
        }else{
            System.out.println("founded element : " +findValue);
        }
        
    }
    
}
