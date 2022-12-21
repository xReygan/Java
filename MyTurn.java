import java.util.LinkedList;

public class MyTurn {             // создание 'очереди'
    LinkedList <String> turn = new LinkedList<>();
    int index = 0;                // указатель индекса на следующий элемент, которого еще нет

    public void enqueue(String item) {
        turn.addLast(item);
        index ++;
    }

    public String first() {
        return turn.peekFirst();
    }

    public String dequeue() {
        index --;
        return turn.pollFirst();
    }

    public int size() {
        return index;
    }

    public void view() {
        System.out.println(turn);
    }
}
