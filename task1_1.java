// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        int sum = 0;
        double fa = 1;
        for(int i = 1; i <= n; i ++){
            sum = sum + i;
            fa = fa * i;
        }
            System.out.println("n(+)= " + sum);
            System.out.println("n!= " + fa);
            input.close();
    }
}

