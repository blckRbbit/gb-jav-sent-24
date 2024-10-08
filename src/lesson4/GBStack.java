package lesson4;

/**
 Реализовать стэк с помощью массива.
 Нужно реализовать методы:
 size(), empty(), push(), peek(), pop().
 */
public class GBStack {

    private int size = 0;
    private int capacity = 2;
    private int top = -1;
    private int[] stack = new int[capacity];

    private void addCapacity() {

        capacity = capacity * 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size);
        // откуда, с каой позиции копируем, куда копируем,
        // с какой поз вставляем, сколько втавляем
        stack = newStack; // на этом моменте сборщик мусора(GarbageCollector) сам удалит старый массив

    }

    public boolean isEmpty() {
        return size == 0;
//        return top == -1;
    }

    public int size() {
        return size;
    }

    public void push(int value) {
        if (isFull()) {
            addCapacity();
        }
//        top += 1;
//        stack[top] = value;
        stack[++top] = value; //top++
        size++; //size += 1;
    }

    public int peek() {
        if (isEmpty())
            throw  new RuntimeException("Stack is empty");
        return stack[top];
    }

    public int pop() {
        if (isEmpty())
            throw  new RuntimeException("Stack is empty");
        size--;
        capacity = capacity - 1;

//        int value = stack[top];
//        top = top - 1;
//        return value;
        return stack[top--];
    }

    private boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(stack[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder); //return builder.toString()
    }

}
