// Вывести все простые числа от 1 до 1000


public class task1_2 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.print("Прстые числа от 1 до " + n + " ==> ");
        for (int i = 1; i <= n; i++){
            int temp = i;
            int count = 0;
            for (int j = 1; j <= temp; j ++){
                if (i%j == 0){
                    count = count + 1;
                }
            }
            if (count <= 2){
                System.out.print(i + "  ");
            }
        }
}}
