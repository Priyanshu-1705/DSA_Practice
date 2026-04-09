package A2Z_Sheet.Step9.Lec1;

class ArrayQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public ArrayQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item) {
        if (isFull()) {
            resize();
        }

        data[rear] = item;
        rear = (rear + 1) % data.length; // circular increment
        size++;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < size; i++) {
            temp[i] = data[(front + i) % data.length];
        }

        front = 0;
        rear = size;
        data = temp;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!!");
        }
        return data[front];
    }

    public int delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!!");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        return removed;
    }

    public int size() {
        return size;
    }

    public void display(){
        for (int i = front;i<rear;i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}

public class ImplementQueueUsingArray {
    public static void main(String[] args) throws Exception{
        ArrayQueue queue = new ArrayQueue();
        queue.insert(2);
        queue.insert(4);
        queue.insert(6);
        queue.display();
        System.out.println(queue.delete());
        System.out.println(queue.peek());
        queue.display();
    }
}
