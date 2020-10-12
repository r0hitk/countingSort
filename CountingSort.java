package countingSorting;

class CountingSort {

	static int[] sort(int[] array, int k) {

		int c[] = new int[k+1];
		int b[] = new int[array.length];

		for (int i = 0; i <= k; i++) {

			c[i] = 0;

		}

		for (int i = 0; i < array.length; i++) {

			c[array[i]] = c[array[i]] + 1;

		}

		for (int i = 1; i <= k; i++) {

			c[i] = c[i] + c[i - 1];

		}

		for (int i = array.length - 1; i >= 0; i--) {

			b[c[array[i]]-1] = array[i];
			c[array[i]] = c[array[i]] - 1;
			

		}
		return b;
	}

}
