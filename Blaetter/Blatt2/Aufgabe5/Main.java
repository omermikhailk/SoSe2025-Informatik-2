import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		int[] numberArray = new int[100];
		Scanner s = new Scanner(System.in);

		int count = 0;
		while (s.hasNextInt()) {
			numberArray[count] = s.nextInt();
			count++;
		}
		if (count == 0) {
			System.exit(1);
		}


		int step = 2;
		double[] averageArray;
		int k = 0;

		/* Wenn `count` (die Laenge von `numberArray`) gerade ist, dann fuehren wir
		 * alles normal aus.
		 *
		 * Wenn sie ungerade ist, dann erstellen wir `doubleArray` mit einer Laenge
		 * von `count + 1`, sodass es Platz fuer die letzte Element noch gibt.
		*/
		if (count % 2 == 0) {
			averageArray = new double[count / 2];	

			for (int j = 0; j <= count - 1; j += step) {
				double average = (numberArray[j] + numberArray[j + 1]) / 2;

				averageArray[k] = average;
				k += 1;
			}
		}
		else {
			averageArray = new double[(count + 1) / 2];

			for (int j = 0; j <= count - 1; j += step) {
				double average;

				if (j == count - 1) {
					average = numberArray[j];
				}
				else {
					average = (numberArray[j] + numberArray[j + 1]) / 2.0;
				}

				averageArray[k] = average;
				k += 1;
			}
		}

		System.out.println(Arrays.toString(averageArray));
	}
}
