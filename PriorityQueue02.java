package priorityqueuepackage;

import java.util.PriorityQueue;

public class PriorityQueue02 implements Comparable<PriorityQueue02>{
    int id;
    String name;

    PriorityQueue02(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PriorityQueue02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        PriorityQueue02 priorityQueue021 = new PriorityQueue02(1, "Ananda");
        PriorityQueue02 priorityQueue022 = new PriorityQueue02(2, "Kumar");
        PriorityQueue02 priorityQueue023 = new PriorityQueue02(3, "Magar");

        PriorityQueue<PriorityQueue02> priorityQueue = new PriorityQueue<>();

        // Adding elements
        priorityQueue.add(priorityQueue021);
        priorityQueue.add(priorityQueue022);
        priorityQueue.add(priorityQueue023);

        // Printing the original elements
        for (PriorityQueue02 elements: priorityQueue){
            System.out.print(elements + " ");
        }

        System.out.println();

        // Adding the element using offer() method
        priorityQueue.offer(new PriorityQueue02(3, "Jayant"));
        // Printing the original elements
        for (PriorityQueue02 elements: priorityQueue){
            System.out.print(elements + " ");
        }

        System.out.println();
        // Removing the head element
        priorityQueue.poll();

        // Printing after the removal of head element
        for (PriorityQueue02 elements: priorityQueue){
            System.out.print(elements + " ");
        }

    }

    @Override
    public int compareTo(PriorityQueue02 o) {
        return 0;
    }
}
