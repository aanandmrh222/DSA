package AK_01_Array;
import java.util.Arrays;


public class AK_04_BinarySearch{
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr1[] = {15,19,25,28,31,36,40,45,55,65,75};

        int key = 75;

//        int arr1[] = {75,19,45,25,28,55,36,40,31,65,15};
//        Arrays.sort(arr1);
        System.out.println("Key present at index: "+binarySearch(arr1,key));

    }
}
