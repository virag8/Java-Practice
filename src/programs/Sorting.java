package programs;

public class Sorting {
	public static void main(String[] args) {
		int[] numbers = { 10, 43, 11, 56, 11, 90, 0, 1, 10 };
		numbers = selectionSort(numbers);
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

	public static void bubbleSort(int[] numbers) {
		int[] sortednumber = numbers;
		int loop = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					sortednumber[i] = numbers[j];
				}
				loop++;
			}
		}
		System.out.println("loop count: " + loop);
	}

	public static int[] selectionSort(int[] numbers) {
		int loop = 0;
		for (int i = 0; i < numbers.length; i++) {
			// int temp = numbers[i];
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[j];
					// swap i with temp
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
				loop++;
			}
		}
		System.out.println("loop count: " + loop);
		return numbers;
	}
}
