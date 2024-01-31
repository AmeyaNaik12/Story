import java.util.ArrayList;

public class StackUsingArrayList<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();
    }
}