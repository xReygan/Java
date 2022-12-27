//  Реализовать алгоритм пирамидальной сортировки (HeapSort).
// (Можно использовать массивы)


public class task5_3 {
    public static void main(String args[]) {
		int array[] = {48, 7, 27, 11, 3, 7, 1, 10, 2, 3, 7};
        System.out.println("Исходный массив: ");
        outArray(array);
		sort(array);
		System.out.println("Отсортированный массив: ");
		outArray(array);
	}


	public static void sort(int array[]) {
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
            pyramid(array, n, i);
        }
		for (int i = n - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			pyramid(array, i, 0);
		}
	}


	public static void pyramid(int array[], int n, int i) {
		int big = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && array[left] > array[big]) {
            big = left;
        } if (right < n && array[right] > array[big]) {
            big = right;
        } if (big != i) {
			int temp = array[i];
			array[i] = array[big];
			array[big] = temp;
			pyramid(array, n, big);
		}
	}


	public static void outArray(int array[]) {
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + " ");
        }
		    System.out.println();
	}	
}
