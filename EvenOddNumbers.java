package Array;
public class EvenOddNumbers {
	public static void main(String[] args) {
        int[] numbers = { 2, 5, 8, 10, 13, 15, 20, 25, 30 };
        System.out.println("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven Numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nOdd Numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
	}

}
