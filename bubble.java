
import java.util.Random;

public class bubble {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10]; //array of size 10
        //fills the array with random ints between 0 and 100
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = rand.nextInt(100); 
        }
        System.out.println("Before: ");
        printArray(numbers);
        //bubble sort
        boolean swapping = true;
        while(swapping){
            swapping = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    swapping = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        System.out.println("\nAfter: ");
        printArray(numbers);
    }
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}