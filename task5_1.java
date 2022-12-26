// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.


import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task5_1 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> name = new HashMap<Integer, String>();
        HashMap<Integer, String> birthday = new HashMap<Integer, String>();
        HashMap<Integer, String> work = new HashMap<Integer, String>();
        HashMap<Integer, String> tel = new HashMap<Integer, String>();
        HashMap<Integer, String> tel2 = new HashMap<Integer, String>();
        Scanner in = new Scanner(System.in);
        while (true) {
        System.out.print("1 - Генерировать справочник"+"\n"+"2 - Сохранить справочник"+"\n"+"3 - Загрузить справочник"+"\n"+"4 - Просмотреть справочник"+"\n"+"5 - Редактировать справочник"+"\n"+"6 - Выход"+"\n");
        System.out.print("        ==> ");
        int com = in.nextInt();

        switch (com) {
            case 1:
                generator(name, birthday, work, tel, tel2);
                out(name, birthday, work, tel, tel2);
                break;
            case 2:
                writeFile(name, birthday, work, tel, tel2);
                out(name, birthday, work, tel, tel2);
                break;
            case 3:
                readFile(name, birthday, work, tel, tel2);
                out(name, birthday, work, tel, tel2);
                break;
            case 4:
                out(name, birthday, work, tel, tel2);
                break;
            case 5:
            System.out.print("1 - новая запись, 2 - исправление, 3 - удаление: --> ");
                int com2 = in.nextInt();
                switch (com2) {
                    case 1:
                        System.out.print("Введите новое имя: ");
                        String n = in.next();
                        System.out.print("Введите день рождения: ");
                        String b = in.next();
                        System.out.print("Введите место работы: ");
                        String w = in.next();
                        System.out.print("Введите телефон: ");
                        String t = in.next();
                        System.out.print("Введите дополнительный телефон: ");
                        String t2 = in.next();
                        int s = name.size();
                        name.put(s, n);
                        birthday.put(s, b);
                        work.put(s, w);
                        tel.put(s, t);
                        tel2.put(s, t2);
                        out(name, birthday, work, tel, tel2);
                        break;
                    case 2:
                        System.out.print("Введите номер строки для редактирования: ");
                        int st = in.nextInt();
                        System.out.print("Имя: " + name.get(st - 1) + " -- Введите новое Имя: ==> ");
                        String xx = in.next();
                        name.put(st - 1, xx);
                        System.out.print("День рождения: " + birthday.get(st - 1) + " -- Введите новый День рождения: ==> ");
                        xx = in.next();
                        birthday.put(st - 1, xx);
                        System.out.print("Место работы: " + work.get(st - 1) + " -- Введите новое Место работы: ==> ");
                        xx = in.next();
                        work.put(st - 1, xx);
                        System.out.print("Телефон: " + tel.get(st - 1) + " -- Введите новый Телефон: ==> ");
                        xx = in.next();
                        tel.put(st - 1, xx);
                        System.out.print("Доп. телефон: " + tel2.get(st - 1) + " -- Введите новый Доп. телефон: ==> ");
                        xx = in.next();
                        tel2.put(st - 1, xx);
                        out(name, birthday, work, tel, tel2);
                        break;
                    case 3:
                        System.out.print("Введите номер удаляемой строки: ");
                        int num = in.nextInt();
                        int d = name.size();
                        name.remove(num-1);
                        birthday.remove(num-1);
                        work.remove(num-1);
                        tel.remove(num-1);
                        tel2.remove(num-1);
                        if (num != d) {
                            for (int i = num; i < d; i ++) {
                                name.put(i - 1, name.get(i));
                                birthday.put(i - 1, birthday.get(i));
                                work.put(i - 1, work.get(i));
                                tel.put(i - 1, tel.get(i));
                                tel2.put(i - 1, tel2.get(i));
                            }
                            name.remove(name.size() - 1);
                            birthday.remove(birthday.size() - 1);
                            work.remove(work.size() - 1);
                            tel.remove(tel.size() - 1);
                            tel2.remove(tel2.size() - 1);
                        }
                        out(name, birthday, work, tel, tel2);
                        break;
                }
                break;    
            case 6:
                in.close();
                System.exit(0);
                break;
        }
        }
    }
  
    
    public static void generator(HashMap<Integer, String> name, HashMap<Integer, String> birthday, HashMap<Integer, String> work, HashMap<Integer, String> tel, HashMap<Integer, String> tel2) {
        String[] nam = {"Василий Алибабаевич","Макар Сильный","Чук Северный","Гек Южный","Веня Прытко","Семен Кале","Броня Питерский","Джон Малкович","Гай Ричи","Брюс Ли"};
        String[] bir = {"10.05.1985","23.02.1965","11.10.1990","07.08.1998","19.03.2004","29.12.1987","13.02.2012","15.06.1998","10.10.1910","30.07.1968"};
        String[] wor = {"Астрахань","Владимир","Суздаль","Курган","Тверь","Казань","Магадан","Канзас Сити","Сиетл","Нью Йорк"};
        String[] te = {"89274536776","89336548989","89274534455","89034563488","89442315665","89998789192","89016713243","13029997433","16893964040","140256574890"};
        String[] te2 = {" ","88094541681"," ","89034534408"," "," "," ","87452237602"," "," "};
        for (int i = 0; i < nam.length; i ++) {
            name.put(i, nam[i]);
            birthday.put(i, bir[i]);
            work.put(i, wor[i]);
            tel.put(i, te[i]);
            tel2.put(i, te2[i]);
        }
        return;        
    }


    public static void out(HashMap<Integer, String> name, HashMap<Integer, String> birthday, HashMap<Integer, String> work, HashMap<Integer, String> tel, HashMap<Integer, String> tel2) {
        System.out.format("%6s%40s%16s%20s%16s%16s\n", "  №", "             Имя            ", "  Дата рождения", "   Место работы", "    Телефон ", " Доп. телефон");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < name.size(); i ++) {
            System.out.format("%6d%40s%16s%20s%16s%16s\n", i+1, name.get(i), birthday.get(i), work.get(i), tel.get(i), tel2.get(i));
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }


    public static void writeFile(HashMap<Integer, String> name, HashMap<Integer, String> birthday, HashMap<Integer, String> work, HashMap<Integer, String> tel, HashMap<Integer, String> tel2) throws IOException{
        FileWriter fw = new FileWriter("tel_dat.txt", false);
        try{ 
            String line = "";
            String line2 = "";
            String line3 = "";
            String line4 = "";
            String line5 = "";
            for (int i = 0; i < name.size(); i ++){
                line = line + name.get(i) + ";";
                line2 = line2 + birthday.get(i) + ";";
                line3 = line3 + work.get(i) + ";";
                line4 = line4 + tel.get(i) + ";";
                line5 = line5 + tel2.get(i) + ";";
                }
            fw.write(line);
            fw.write("\n");
            fw.write(line2);
            fw.write("\n");
            fw.write(line3);
            fw.write("\n");
            fw.write(line4);
            fw.write("\n");
            fw.write(line5);            
        } catch(IOException exception){
            exception.printStackTrace();
        } finally {fw.close();           
        }       
    } 


    public static void readFile(HashMap<Integer, String> name, HashMap<Integer, String> birthday, HashMap<Integer, String> work, HashMap<Integer, String> tel, HashMap<Integer, String> tel2) throws IOException{
        File file = new File("tel_dat.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String x = "";
        name.clear();
        birthday.clear();
        work.clear();
        tel.clear();
        tel2.clear();
        try 
        {
            String line;
            while ((line = br.readLine()) != null) {
               x = x + line + "\n";
            }    
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] dx = x.split("\n");     
        String[] nam = dx[0].split(";");
        String[] bir = dx[1].split(";");
        String[] wor = dx[2].split(";");
        String[] te = dx[3].split(";");
        String[] te2 = dx[4].split(";");
        for (int i = 0; i < nam.length; i ++) {
            name.put(i, nam[i]);
            birthday.put(i, bir[i]);
            work.put(i, wor[i]);
            tel.put(i, te[i]);
            tel2.put(i, te2[i]);
        }        
        return;
        }
}
