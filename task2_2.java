// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_2 {
    public static void main(String[] args) throws IOException{ 
        Logger logger = Logger.getLogger(task2_2.class.getName());
        logger.setLevel(Level.CONFIG);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        Integer n = in.nextInt();
        int [] array = new int[n];               // создание n-размерного массива
        for (int i = 0; i < n; i ++){
            array[i] = 0 + (int) (Math.random() * 10);
        }
        System.out.println("Исходный массив: ==> " + java.util.Arrays.toString(array));
        for (int i = 0; i < n; i ++){            // пузырьковая сортировка массива
            int flag = 0;   // флаг перестановки элементов
            for (int j = 0; j < n - 1 - i; j ++){
            if(array[j] > array[j + 1]){
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
                flag ++;
            }
        }
        if (flag == 0){     // выход из цикла, если не было перестановок
            break;
        }
            logger.log(Level.CONFIG, "Запись:" + java.util.Arrays.toString(array));
    }
        System.out.println("Полученный массив: ==> " + java.util.Arrays.toString(array));
        in.close();
    }  
}