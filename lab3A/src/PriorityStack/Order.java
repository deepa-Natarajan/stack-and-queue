package PriorityStack;

public class Order {

    private String orderCode;//A private instance variable for the order code (which is alphanumeric)
    private int priority;//A private instance variable for the priority of the order (the acceptable values are 1, 2, or 3).


    Order(String orderCode, int p) {//A constructor that sets the two instance variables.

        this.orderCode = orderCode;
        if (p == 1) {
            priority = p;
        }
        else if (p == 2) {
            priority = p;
        }
        else if (p == 3) {
            priority = p;
        }
        else  {
            priority = 3;
        }

    }

    public String getOrderCode() {//getter for order 
        return orderCode;
    }

    public int getPriority() {//getter for priority code
        return priority;
    }

    public String tostring() {//A toString() method that returns a String that is a report on the data in the Order object.

        return String.format("OrderCode: " + orderCode + " ; " + "Priority: " + priority);
    }

}
