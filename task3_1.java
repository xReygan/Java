// Реализовать алгоритм сортировки слиянием


import java.util.Arrays;
import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        Integer n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i ++){                      // создание n-размерного массива
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println("Исходный список: ==> " + Arrays.toString(array));
        mergeSort(array, array.length);
        System.out.println("Обработанный список: ==> " + Arrays.toString(array));
        in.close();
    }


    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }


    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k] = l[i];
            k=k+1;
            i=i+1;
        } else {
            a[k] = r[j];
            k=k+1;
            j=j+1;
        }
        }
        while (i < left) {
        a[k] = l[i];
        k=k+1;
        i=i+1;
        }
        while (j < right) {
        a[k] = r[j];
        k=k+1;
        j=j+1;
        }
    }
}
