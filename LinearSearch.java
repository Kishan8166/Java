import java.util.*;
public class LinearSearch {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int count=0;
            System.out.println("Enter the size of an Array");
            int size = input.nextInt();

            if(size<=0){
                System.out.println("Please enter a number greater than 0");
                System.exit(0);
            }
            int[] numbers = new int[size];
            System.out.println("Enter the Elements of an Array");

            for (int i = 0; i < size; i++) {
                numbers[i] = input.nextInt();
            }
            System.out.println("Enter the Element to search");

            int x = input.nextInt();
            for (int i = 0; i < size; i++) {
                if (numbers[i] == x) {
                    System.out.println("Index of given element is " + i);
                    count++;
                    break;
                }
            }
    
            if(count==0){
                System.out.println("Searched element not found!!!");
            }
            input.close();

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer!!!");
        }

        
    }
}