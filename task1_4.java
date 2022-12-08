// Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение
// до верного равенства. Предложить хотя бы одно решение
// или сообщить, что его нет.

import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String data = in.nextLine();
        String da = data.replaceAll("\\s", "").replace('+', ' ').replace('=', ' ');
        String[] d = da.split(" ");
        String op3 = d[2];     
        for (int i = 0; i < 10; i ++){
            String k = String.valueOf(i);
            for (int j = 0; j < 10; j ++){
                String kk = String.valueOf(j);
                String op1 = d[0].replace("?", k);
                String op2 = d[1].replace("?", kk);
                if(Integer.parseInt (op1) + Integer.parseInt (op2) == Integer.parseInt (op3)){
                    System.out.println(data + " ==> " + op1 + " + " + op2 + " = " + op3);
                    System.exit(0);
                }
            }
        }
        System.out.println("С данным вводом, Решения нет.");
        in.close();
    }
}
