//Дана json строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) throws IOException{
        String[][] data = {
            {"фамилия:Иванов","оценка:5","предмет:Математика"},
            {"фамилия:Петрова","оценка:4","предмет:Информатика"},
            {"фамилия:Краснов","оценка:5","предмет:Физика"}
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Введите y для создания json-файла, или n, если не надо (y/n): ");
        String n = in.next();
        if (n.equals("y") ) {
            writeFile(data);
        }
        StringBuilder out = new StringBuilder();
        String tabl;
        tabl = readFile();      
        String [] tmp = tabl.replace("\n", " ").replace(",", " ").replace(":", " ").split(" ");
        
        for (int i = 0; i < tmp.length; i ++){
            out = out.append("Студент ").append(tmp[i +1]).append(" получил ").append(tmp[i + 3]).append(" по предмету ").append(tmp[i + 5]).append("\n");
            i = i + 5;
        }
        System.out.println(out);
        in.close();
    }


    public static String readFile() throws IOException{
        StringBuilder dataLine = new StringBuilder();
        String data = "";
        File file = new File("data.json");
        BufferedReader br = new BufferedReader(new FileReader(file));
        try 
        {
            String line;
            while ((line = br.readLine()) != null) {
                dataLine.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = dataLine.toString();
        return data;
    }

    
   public static void writeFile(String [][] data) throws IOException{
        FileWriter fw = new FileWriter("data.json", false);
        try{ 
            for (int i = 0; i < data.length; i ++){
                String sep = ",";
                String line = "";
                String tmp = "";
                for (int j = 0; j < data[0].length; j ++){
                    line = tmp + data[i][j];
                    tmp = sep; 
                    fw.write(line); 
                }
                fw.write("\n");
            }
        }catch(IOException exception){
            exception.printStackTrace();
        }finally{fw.close();           
        }       
    } 
}