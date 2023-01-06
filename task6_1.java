// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести подходящие по условиям.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class task6_1 {
    public static void main(String[] args) {
        HashMap <Integer, String> filter = new HashMap<Integer, String>();  //для сохранения критериев и параметров фильтрации
        TreeSet <Integer> f1 = new TreeSet<Integer>();  //для всех значений размера ОЗУ, которые есть
        TreeSet <Integer> f2 = new TreeSet<Integer>();  //для всех значений размера НЖМД, которые есть
        TreeSet <String> f3 = new TreeSet<String>();    //для всех значений ОС, которые есть
        TreeSet <String> f4 = new TreeSet<String>();    //для всех значений цвета, которые есть

        // Создание экземпляров класса
        MyLaptop lap1 = new MyLaptop("HP", 4, 250, "Windows10", "Черный", 1.7f);
        MyLaptop lap2 = new MyLaptop("Acer", 4, 400, "Windows11", "Черный", 1.55f);
        MyLaptop lap3 = new MyLaptop("Asus", 8, 400, "Windows11", "Серебристый", 1.3f);
        MyLaptop lap4 = new MyLaptop("Lenova", 16, 500, "Windows10", "Серый", 1.8f);
        MyLaptop lap5 = new MyLaptop("Apple", 64, 1000, "iOS", "Белый", 1.1f);
        MyLaptop lap6 = new MyLaptop("Samsung", 16, 300, "Windows10", "Черный", 1.5f);
        MyLaptop lap7 = new MyLaptop("Huawei", 8, 250, "Windows11", "Белый", 1.65f);
        MyLaptop lap8 = new MyLaptop("Irbis", 4, 200, "nonOS", "Коричневый", 1.45f);
        MyLaptop lap9 = new MyLaptop("Dell", 32, 500, "Windows11", "Белый", 1.6f);
        MyLaptop lap10 = new MyLaptop("Chudo", 128, 2000, "Windows12", "Красный", 1.15f);
        
        ArrayList<MyLaptop> lap = new ArrayList<>();  //временный список для выбранных ноутбуков
        ArrayList<MyLaptop> lapOut = new ArrayList<>();  //список для вывода отфильтрованных ноутбуков
        
        //Наполнение всех значений ОЗУ, НЖМД, ОС и цвета, которые есть в магазине
        f1.add(lap1.getRam()); f2.add(lap2.getRam()); f1.add(lap3.getRam()); f1.add(lap4.getRam()); f1.add(lap5.getRam()); f1.add(lap6.getRam()); f1.add(lap7.getRam()); f1.add(lap8.getRam()); f1.add(lap9.getRam()); f1.add(lap10.getRam());
        f2.add(lap1.getSsd()); f2.add(lap2.getSsd()); f2.add(lap3.getSsd()); f2.add(lap4.getSsd()); f2.add(lap5.getSsd()); f2.add(lap6.getSsd()); f2.add(lap7.getSsd()); f2.add(lap8.getSsd()); f2.add(lap9.getSsd()); f2.add(lap10.getSsd());
        f3.add(lap1.getOs()); f3.add(lap2.getOs()); f3.add(lap3.getOs()); f3.add(lap4.getOs()); f3.add(lap5.getOs()); f3.add(lap6.getOs()); f3.add(lap7.getOs()); f3.add(lap8.getOs()); f3.add(lap9.getOs()); f3.add(lap10.getOs());
        f4.add(lap1.getColor()); f4.add(lap2.getColor()); f4.add(lap3.getColor()); f4.add(lap4.getColor()); f4.add(lap5.getColor()); f4.add(lap6.getColor()); f4.add(lap7.getColor()); f4.add(lap8.getColor()); f4.add(lap9.getColor()); f4.add(lap10.getColor());
       
        while (true) {
            lap.clear();
            lap.add(lap1); lap.add(lap2); lap.add(lap3); lap.add(lap4); lap.add(lap5); lap.add(lap6); lap.add(lap7); lap.add(lap8); lap.add(lap9); lap.add(lap10);
            Scanner in = new Scanner(System.in, "Cp866");
            System.out.print("\nВас приветствует магазинный помощник. Давайте выберем Вам подходящий ноутбук. y/n ?: ==> ");
            String x = in.nextLine();
            if (x.equals("n")) {
                in.close();
                System.exit(0);   //выход если ввели 'n'
            }
            filter.clear();
            System.out.print("Введите критерии запроса через пробел:\n1 - Объем ОЗУ"+"\n"+"2 - Объем ЖД"+"\n"+"3 - Операционная система"+"\n"+"4 - Цвет"+"\n");
            System.out.print("        ==> ");
            String []fl = in.nextLine().split(" ");
            String f = "";
            for (int i = 0; i < fl.length; i ++){
                if (fl[i].equals("1")){
                    System.out.print("Введите размер ОЗУ (в наличии "+f1+" ГБ): ");
                    f = in.next();
                    filter.put(1, f);
                }
                if (fl[i].equals("2")){
                    System.out.print("Введите размер НЖМД (в наличии "+f2+" ГБ): ");
                    f = in.next();
                    filter.put(2, f);
                }
                if (fl[i].equals("3")){
                    System.out.print("Введите предустановенную OS (в наличии "+f3+"): ");
                    f = in.next();
                    filter.put(3, f);
                }
                if (fl[i].equals("4")){
                    System.out.print("Введите предпочтительный цвет (в наличии "+f4+"): ");
                    f = in.next();
                    filter.put(4, f);
                } 
            }
            for (HashMap.Entry<Integer, String> entry : filter.entrySet()) {
                switch (entry.getKey()) {    //проверка условий критериев, параметров и наполнение отфильтрованного списка на вывод
                    
                    case 1:
                        lapOut.clear();
                        for (MyLaptop ml : lap) {
                            if (Integer.parseInt(entry.getValue()) <= ml.getRam()) {
                                lapOut.add(ml);
                            }
                        }
                        lap.clear();
                        lap.addAll(lapOut);
                        break;

                    case 2:
                        lapOut.clear();
                        for (MyLaptop ml : lap) {
                            if (Integer.parseInt(entry.getValue()) <= ml.getSsd()) {
                                lapOut.add(ml);
                            }
                        }
                        lap.clear();
                        lap.addAll(lapOut);
                        break;
                    
                    case 3:
                        lapOut.clear();
                        for (MyLaptop ml : lap) {
                            if (entry.getValue().equals(ml.getOs())) {
                                lapOut.add(ml);
                            }
                        }
                        lap.clear();
                        lap.addAll(lapOut);
                        break;
                    
                    case 4:
                        lapOut.clear();
                        for (MyLaptop ml : lap) {
                            if (entry.getValue().equals(ml.getColor())) {
                                lapOut.add(ml);
                            }
                        }
                        lap.clear();
                        lap.addAll(lapOut);
                        break;  
                }
            }
            if (lapOut.isEmpty()) {
                System.out.println("С данными условиями поиска товары не нейдены. Повторите поиск с другими критериями...");
            } else {
                System.out.println("С данными условиями поиска "+filter+" найдены следующие товары: ");
                for (MyLaptop ml : lapOut) {
                    System.out.println(ml);
                }
            }
        }
    }   
}
