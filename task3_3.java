// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        Integer n = in.nextInt();
        ArrayList<Integer> lis = new ArrayList<>();               
        for (int i = 0; i < n; i ++){                      // создание n-размерного списка
            lis.add((int) (Math.random() * 11));
        }
        System.out.println("Исходный список: ==> " + lis);
        int min = lis.get(0);
        int max = lis.get(0);
        int sum = 0;
        for (int i = 0; i < lis.size(); i ++){            
            sum = sum + lis.get(i);
            if (lis.get(i) < min){
                min = lis.get(i);
            }else if (lis.get(i) > max){
                max = lis.get(i);
            }   
        }
        float average = (float)sum / lis.size();
        System.out.println("Минимальный зачение: ==> " + min);
        System.out.println("Максимальное зачение: ==> " + max);
        System.out.println("Среднее арифметическое зачение: ==> " + average);
        in.close();
    }  
}
