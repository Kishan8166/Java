import java.util.*;

public class BinarySearch {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
            int size = sc.nextInt();

            if(size<=0){
                System.out.println("Please enter a number greater than 0");
                System.exit(0);
            }
            int[] ar = new int[size];
            System.out.println("Enter the Elements of an Array");

            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            Arrays.sort(ar);

            System.out.println("Sorted Array: ");
            for(int i=0;i<size;i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println("\nEnter the Element to search");

            int num = sc.nextInt();
            sc.close();
        
            
        int last = size - 1;
        binarySearch(ar, 0, last, num);
    }
    public static void binarySearch(int arr1[], int first, int last, int num) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr1[mid] < num) {
                first = mid + 1;
            } else if (arr1[mid] == num) {
                System.out.println("Element is at: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found!");
        }
    }
}