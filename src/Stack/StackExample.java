package Stack;

public class StackExample {

    private int maxSize;
    private int[] stackNumbers;
    private int top;

    public StackExample(int size) {
        maxSize = size;
        stackNumbers = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("The stack is full");
            return;
        }
        stackNumbers[++top] = value;
        System.out.println(value + " is pushed here");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return -1;
        }
        int poppedElement = stackNumbers[top--];
        System.out.println(poppedElement + " is popped here");
        return poppedElement;
    }

    public int top() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return -1;
        }
        System.out.println(stackNumbers[top] + " is the top element");
        return stackNumbers[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
