package Stack;

public class runner {

    public static void main(String[] args) {

        StackExample Stack = new StackExample(1);

        Stack.push(10);
        Stack.push(49);

        Stack.pop();
        Stack.pop();


        Stack.top();
    }
}
