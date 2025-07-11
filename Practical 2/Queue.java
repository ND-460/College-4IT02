import java.util.*;
class Queue {
    int[] arr;
    int front;
    int rear;
    int size;
    Queue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
    }
    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            arr[++rear] = x;
        }
    }
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return arr[front++];
        }
    }
    int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }
    boolean isEmpty() {
        return front > rear;
    }
    int size() {
        return rear - front + 1;
    }
    public static void main(String[] args) {
        System.out.println("By 22IT460");
        Queue queue = new Queue(15);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());
        queue.dequeue();
        System.out.println("Front element after dequeue is: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Size after dequeue: " + queue.size());
    }
}