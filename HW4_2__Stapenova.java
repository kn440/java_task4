import java.util.LinkedList;
import java.util.ArrayDeque;

// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class HW4_2__Stapenova {

    public static void main(String[] args) {

        ArrayDeque<Integer> linkedList1 = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            linkedList1.add((int) (Math.random() * (10 - 1)));
        }
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (Integer temp : linkedList1) {
            linkedList2.add(temp);
        }

        System.out.println("Очередь: " + linkedList2);
        int element = 22;
        enqueue(linkedList2, element);
        System.out.println("Очередь, после добавления элемента: "+ element+ " " + linkedList2);

        System.out.println("Очередь, без первого элемента: "+dequeue(linkedList2)+" "+linkedList2);
        System.out.println("Первый элемент текущей очереди (метод first): "+first(linkedList2));
        System.out.println("Очередь, после использования метода first(): "+  linkedList2);
    }

    public static void enqueue(LinkedList<Integer> linkedList1, int num) {
        linkedList1.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> linkedList1) {
        int num = 0;
        num = linkedList1.get(0);
        linkedList1.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> linkedList1) {
        int num = 0;
        num = linkedList1.get(0);
        return num;
    }
}