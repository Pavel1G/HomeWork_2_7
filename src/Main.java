import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Mike" + Integer.toString(i));
        }
        System.out.println(queue1);
        System.out.println();
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Bob" + Integer.toString(i));
        }
        System.out.println(queue2);
        System.out.println("----------------");

        addHuman("John", queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
    }

    public static void addHuman(String name, Queue queue1, Queue queue2) {
        if (queue1.size() == queue2.size() && queue1.size() == 5) {
            System.out.println("Ххххххааааааля!");
        } else if (queue1.size() < queue2.size()) {
            queue1.add(name);
        } else {
            queue2.add(name);
        }
    }
}