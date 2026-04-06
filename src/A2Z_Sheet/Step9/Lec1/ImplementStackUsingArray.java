package A2Z_Sheet.Step9.Lec1;

class ArrayStack{
    private int[] data;
    private final static int DEFAULT_SIZE = 5;
    private int top = -1;

    public ArrayStack(){
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int item){
        if (isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++top] = item;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is Empty!!!");
        }
        return data[top];
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is Empty!!!");
        }
        int removed = data[top--];
        return removed;
    }

    public int size(){
        return top + 1;
    }
}

public class ImplementStackUsingArray {
    public static void main(String[] args) throws Exception {
        ArrayQueue stack = new ArrayQueue();
        stack.insert(2);
        stack.insert(3);
        stack.insert(5);
        System.out.println(stack.delete());
        System.out.println(stack.peek());
    }
}
