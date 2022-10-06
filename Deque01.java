
package priorityqueuepackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque01 {
    int id;
    String name;

    Deque01(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deque01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Deque01 dq1 = new Deque01(2, "Ananda");
        Deque01 dq2 = new Deque01(5, "Kumar");
        Deque01 dq3 = new Deque01(1, "Magar");

        Deque<Deque01> dq = new ArrayDeque<>();
        dq.add(dq1);
        dq.add(dq2);
        dq.add(dq3);

        for (Deque01 aq: dq){
            System.out.print(aq + " ");
        }

        System.out.println();
        dq.addFirst(new Deque01(4, "Prakash"));
        for (Deque01 aq: dq){
            System.out.print(aq + " ");
        }

        System.out.println();
        dq.addLast(new Deque01(7, "Jayant"));
        for (Deque01 aq: dq){
            System.out.print(aq + " ");
        }

        System.out.println();
        System.out.println(dq.peek());

        System.out.println();
        dq.pop();
        for (Deque01 aq: dq){
            System.out.print(aq + " ");
        }

    }
}