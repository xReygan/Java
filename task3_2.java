// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        Integer n = in.nextInt();
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 0; i < n; i ++){                      // создание n-размерного списка
            lis.add((int) (Math.random() * 11));
        }
        System.out.println("Исходный список: ==> " + lis);
        lis.removeIf(x -> x % 2 == 0);
        System.out.println("Обработанный список: ==> " + lis);
        in.close();
    }
}
