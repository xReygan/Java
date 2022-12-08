//Реализовать простой калькулятор


import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.print("Введите знак действия: ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
        float rez = 0;
        if (sign.equals("/")){
            rez = num1 / num2;
        }else if (sign.equals("*")){
            rez = num1 * num2;
        }else if (sign.equals("+")){
            rez = num1 + num2;
        }else if (sign.equals("-")){
            rez = num1 - num2;
        }
        System.out.println(num1 + " " + sign + " "+ num2 + " = " + rez);       
        in.close();
    }
}
