import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Mike" + Integer.toString(i));
        }
        System.out.println(queue1);

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Bob" + Integer.toString(i));
        }
        System.out.println(queue2);
        System.out.println("----------------");

        addHuman("John", queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println("----------------");

        removeHuman(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();


        System.out.println("Задание 3.");
        example();
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

    public static void removeHuman(Queue queue1, Queue queue2) {
        if (Math.random() > 0.5) {
            for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
                queue2.poll();
            }
        } else {
            for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
                queue1.poll();
            }
        }
    }


    //    Задание 3.
    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        biDemArrList.get(i).add(j, "◯");
                    } else {
                        biDemArrList.get(i).add(j, "●");
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        biDemArrList.get(i).add(j, "●");
                    } else {
                        biDemArrList.get(i).add(j, "◯");
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}