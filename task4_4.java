// Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
//http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 Вычислить запись если это возможно.
// (Объяснение подобной задачи есть в лекции)


//import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class task4_4 {
    public static void main(String[] args) {
        LinkedList <String> stack = new LinkedList<>();
        ArrayList<String> out = new ArrayList<String>();
        LinkedList <String> exp = new LinkedList<>();
        //Scanner in = new Scanner(System.in);
        //System.out.print("Введите арифметическое выражение: ");
        //String expression = in.next();
        String expression = "3+4*2/(1-5)*2";
        System.out.print("  Прямая запись: ==> ");
        for (int i = 0; i < expression.length(); i ++) {
            String c = Character.toString(expression.charAt(i)); 
            exp.add(c);
            System.out.print(c + " ");
        }
     
        for (int i = 0; i < exp.size(); i ++) {
            if (exp.get(i).contains("(")) {
                stack.push(exp.get(i));

            } else if (exp.get(i).contains(")")) {
                while (!(stack.peek().contains("("))) {
                    if (stack.peek() != null) {
                        out.add(stack.pop());
                    }
                } stack.pop();      

            } else if (exp.get(i).contains("/") || exp.get(i).contains("*")) {
                if (stack.peek().contains("+") || stack.peek().contains("-")) {
                    stack.push(exp.get(i));
                } else if (stack.peek().contains("/") || stack.peek().contains("*")) {
                    if (stack.peek() != null) {
                        out.add(stack.pop());
                    }
                    stack.push(exp.get(i));
                }
            
            } else if (exp.get(i).contains("+") || exp.get(i).contains("-")) {
                if (stack.peek() != null && stack.peek() == "(") {
                    out.add(stack.pop());
                } stack.push(exp.get(i));

            } else out.add(exp.get(i));       
        }
        while (stack.size() != 0) {
            out.add(stack.pop());
        }   
        System.out.println();
        System.out.print("Обратная запись: ==> ");
        for (int i = 0; i < out.size(); i ++) {
            System.out.print(out.get(i) + " ");
        }       
        //in.close();
}
}
