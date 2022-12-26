// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class task5_2 {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        HashMap<String, Integer> name = new HashMap<String, Integer>();
        TreeMap<Integer, String> sortedName = new TreeMap<Integer, String>();
        String[] lis = {"Иван Иванов","Светлана Петрова","Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
        String[] list = new String[lis.length];
        for (int i = 0; i < lis.length; i ++) {        
            list[i] = lis[i].split(" ")[0];
        }
        for (int i = 0; i < list.length; i ++) {
            if (name.containsKey(list[i])) {
                name.put(list[i], name.get(list[i]) + 1);
            } else name.put(list[i], 1);
        }
        System.out.println("Повторяющиеся имена c количеством повторений: ");
        for (HashMap.Entry<String, Integer> entry : name.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Имя  " + entry.getKey() + " повторилось " + entry.getValue() + " раза");
                sortedName.put(entry.getValue(), entry.getKey());
            }                 
        }
        for (HashMap.Entry<Integer, String> entry : sortedName.entrySet()) {
            li.add(entry.getKey());
        }
        System.out.println("Имена отсортированные по убыванию популярности: ");
        Collections.sort(li);
        for (int i = li.size() - 1; i >= 0; i --) {
            for (HashMap.Entry<String, Integer> entry : name.entrySet()) {
                if (entry.getValue() == li.get(i)) {
                    System.out.println("Имя  " + entry.getKey() + " повторилось " + entry.getValue() + " раза");
                }
            }
        }
    }
}
