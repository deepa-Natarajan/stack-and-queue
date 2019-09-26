package PriorityStack;

public class PriorityStackDriver {

    public static void main(String[] args) {
        int size = 5;

        PriorityStack test = new PriorityStack(size);

        if (!test.isFull()) {
            test.push(new Order("Ab123", 1));
        }
        if (!test.isFull()) {
            test.push(new Order("Bw123", 2));
        }
        if (!test.isFull()) {
            test.push(new Order("Cz123", 4));
        }
        if (!test.isFull()) {
            test.push(new Order("Aw123", 2));
        }
        if (!test.isFull()) {
            test.push(new Order("Cv123", 3));
        }

        if (!test.isFull()) {//
            test.push(new Order("Abc123", 2));

        } else {
            System.out.println("This Array can hold  " + size + " Orders !");
        }
        System.out.println();

        /********************************************************************/
        System.out.println("Results before POP() excecution:");
        if (test.isFull()) {// check for isfull()
            System.out.println("Number of Empty array: " + (size - (test.numberOfOrder())));
        }

        System.out.println("Total Number of Orders:" + test.numberOfOrder());//display the number of order objects 
        System.out.println();
        
        /********************************************************************/
        System.out.println("Peek result before Sorting:" + "\n" + test.peek().tostring());
        System.out.println();
        test.prioritySort();//bubble sort with high priority on top of the stack
        System.out.println("Peek result After Sorting:" + "\n" + test.peek().tostring());
        System.out.println();
        /********************************************************************/
        System.out.println("POP method Excecution: ");//pop's and prints the high order from high to low prority
        while (!test.isEmpty()) {
            Order o = test.pop();
            System.out.println(o.tostring());

        }        
        System.out.println();

        /********************************************************************/        
        System.out.println("Results after POP() excecution:");
        if (test.isFull()) {// check for empty array
            System.out.println("The Array is full !!");
        } else {

            System.out.println("Number of Empty array: " + (size - (test.numberOfOrder())));
        }

        System.out.println("Number of Orders:" + test.numberOfOrder());//display the number of order objects 

    }

}
