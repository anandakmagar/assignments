package priorityqueuepackage;

import java.util.PriorityQueue;

class PriorityQueueInteger01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding the elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        // Printing the elements of numbers
        System.out.print("Original Priority Queue: " + numbers);

        System.out.println();

        // Printing the first element
        System.out.println("First Element of Original Priority Queue: " + numbers.peek());

        // Retrieving and removing the head of the queue
        System.out.println("Head of the priority queue removed: " + numbers.poll());

        // Removing the element 4 of the priority queue
        System.out.println(numbers.remove(4));
        // Adding the element to the priority queue
        numbers.offer(5);
        // Printing the elements of numbers
        System.out.print("Final Priority Queue: " + numbers);

    }
}