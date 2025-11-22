package question.pkg4;
import java.util.Scanner;
public class Question4{
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Question4(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is FULL! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        System.out.println("After enqueue(" + value + "):");
        display();
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY! Cannot dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println("After dequeue(): Removed = " + removed);
        display();
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("[ Empty ]\n");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = input.nextInt();

        Question4 q = new Question4(capacity);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("0 - Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = input.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


        
    

