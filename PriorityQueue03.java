package priorityqueuepackage;

import java.util.ArrayDeque;

public class PriorityQueue03 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

        arrayDeque.add(1);
        arrayDeque.add(3);
        arrayDeque.add(5);

        for (Integer a: arrayDeque){
            System.out.print(a + " ");
        }

        System.out.println();

        arrayDeque.addFirst(7);
        for (Integer a: arrayDeque){
            System.out.print(a + " ");
        }

        System.out.println();
        arrayDeque.addLast(9);
        for (Integer a: arrayDeque){
            System.out.print(a + " ");
        }

        System.out.println();
        arrayDeque.remove();
        arrayDeque.addFirst(7);
        for (Integer a: arrayDeque){
            System.out.print(a + " ");
        }

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peek());
    }
}