// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
// (Подобную задачу решали на семинаре. Здесь так же нужно создать класс,
// который будет реализовывать указанные методы)


import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args) {
        MyTurn turn = new MyTurn();
        Scanner in = new Scanner(System.in);
        System.out.println("Заполним очередь из 4 элементов для испытаний методом enqueue(x):");
        for (int i = 0; i < 4; i ++) {
        System.out.println("Введите элемент очереди: ");
        String x = in.next();
        turn.enqueue(x);
        turn.view();
        System.out.println("В очереди " + turn.size() + " элементов");
        }
        System.out.println("Метод first() ==> " + turn.first());
        System.out.print("Смотрим очередь ==> ");
        turn.view();
        System.out.println("Метод dequeue() ==> " + turn.dequeue());
        System.out.print("Смотрим очередь ==> ");
        turn.view();
        System.out.println("Метод dequeue() ==> " + turn.dequeue());
        System.out.print("Смотрим очередь ==> ");
        turn.view();
        System.out.println("Метод first() ==> " + turn.first());
        System.out.print("Смотрим очередь ==> ");
        turn.view();
        System.out.println("Метод enqueue(x) ==> записываем 'end'");
        turn.enqueue("end");
        System.out.print("Смотрим очередь ==> ");
        turn.view();
        System.out.println("Конец испытаний");
        in.close();
}
}
