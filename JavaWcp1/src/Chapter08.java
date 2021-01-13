
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}

		int[] array = {1, 10, 3, 4};
		for (int num = 0; num < array.length; num++) {
			System.out.println(array[num]);
		}

		for (int i : array) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
