package javafirstclass;

public class ArrayExercise {

	public static void main(String[] args) {

		int[] array1 = { 12, 23, 44, 5444, 61231 };
		int[] array2 = { 12, 23, 3312123, 4231123, 5123 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i]+" ");
				}
			}
		}

	}

}
