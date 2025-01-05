import java.util.Random;

public class selection {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10]; //array of size 10
        //fills the array with random ints between 0 and 100
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = rand.nextInt(100); 
        }
        System.out.println("Before: ");
        printArray(numbers);
        //selection sort
        for (int ct = 0; ct < numbers.length-1; ct++) { //doesnt have to iterate at the last element 
            int smallest = ct; //smallest starts as first element in unsorted section
            for (int i = ct + 1; i < numbers.length; i++) //finds smallest in unsorted section
                if (numbers[i] < numbers[smallest]) { 
                    smallest = i;
                }
            //swap element at beginning of unsorted section with the smallest in unsorted
            int temp = numbers[ct];
            numbers[ct] = numbers[smallest];
            numbers[smallest] = temp;
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
