// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.Scanner;

public class task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList <String> list = new LinkedList<>();
        System.out.print("Введите размер списка: ");
        Integer n = in.nextInt();       
        for (int i = 0; i < n; i ++) {
            int tmp = i + 1;
            System.out.print("Введите " + tmp + " элемент списка: ");
            String x = in.next();
            list.add(x);
        }
        System.out.println("Исходный список: ==> " + list);
        System.out.println("Перевернутый список: ==> " + revers(list));
        in.close();       
}

    public static LinkedList<String> revers(LinkedList <String> list) {
        LinkedList <String> reverseList = new LinkedList<>();
        for(int i = list.size() - 1; i >= 0; i --) {
        reverseList.add(list.get(i));
        }
        return reverseList;
    }
}
