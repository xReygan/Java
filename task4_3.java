// В калькулятор добавьте возможность отменить последнюю операцию.


import java.util.Scanner;

public class task4_3 {
    public static void main(String[] args) {
        String com = "n";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.print("Введите знак действия: ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
        do {
        System.out.println(num1 + " " + sign + " "+ num2 + " = " + calc(num1, num2, sign));
        System.out.print("Будем пересчитывать с другим арифметическим действием? y/n: ");
        com = in.next();
        if (com.equals("y")) {
            System.out.print("Введите новый арифметический знак: ");
            sign = in.next();
        }
        } while (com.equals("y"));
        in.close();
    }
    

    public static float calc(float num1, float num2, String sign) {
        float res = 0;
        if (sign.equals("/")){
            res = num1 / num2;
        }else if (sign.equals("*")){
            res = num1 * num2;
        }else if (sign.equals("+")){
            res = num1 + num2;
        }else if (sign.equals("-")){
            res = num1 - num2;
        }
        return res;
    }
}
