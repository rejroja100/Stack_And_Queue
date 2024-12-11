package Q1;

public class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[this.capacity];
    }


    public boolean isFull() {
        return (this.size == this.capacity);
    }


    public boolean isEmpty() {
        return (this.size == 0);
    }


    public void enqueue(int item) {
        if (isFull()) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println("Enqueued: " + item);
    }


    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }


    public int front() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }


    public int rear() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }
}
