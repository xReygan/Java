// К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_4 {
    public static void main(String[] args) throws IOException{ 
        Logger logger = Logger.getLogger(task2_2.class.getName());
        logger.setLevel(Level.CONFIG);
        FileHandler fh = new FileHandler("log2.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.print("Введите знак действия: ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
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
        System.out.println(num1 + " " + sign + " "+ num2 + " = " + res);
        logger.log(Level.CONFIG, "Запись:" + num1 + " " + sign + " "+ num2 + " результат:" + res);       
        in.close();
    }
}
