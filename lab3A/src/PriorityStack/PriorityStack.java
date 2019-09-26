package PriorityStack;

public class PriorityStack {

    private int maxSize;// size of the stack array
    private Order[] orderArray; //array for order objects
    private int top;//top of the stack

    //constructor
    public PriorityStack(int s) {

        maxSize = s; //size of the stack array
        orderArray = new Order[maxSize];// create array
        top = -1; //no items yet   

    }

    public void push(Order order) {
        if (top <= maxSize) {
            orderArray[++top] = order; //increament top and insert i
        } 
    }

    public Order pop() {
        return orderArray[top--];// access item and decrement top
    }

    public Order peek() {
        return orderArray[top];//peek at the top of the stack
    }

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    public int numberOfOrder() {

        return (top + 1);//number of order objects in the array

    }

    public void dispaly() {

        for (int i = 0; i < maxSize; i++) {
            System.out.println(orderArray[i].tostring());
        }
    }

    public void prioritySort() {
        Order temp, rear, front;
        int out, in;
        for (out = maxSize - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                rear = orderArray[out];
                front = orderArray[in];
                if (front.getPriority() < rear.getPriority()) {
                    temp = orderArray[in];
                    orderArray[in] = orderArray[out];
                    orderArray[out] = temp;

                }
            }
        }
    }

}
