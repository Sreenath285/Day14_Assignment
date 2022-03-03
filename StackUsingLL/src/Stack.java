public class Stack {

    StackNode top;

    /***
     * created a public inner class
     */
    public class StackNode {
        int data;
        StackNode node;
    }

    /***
     * push method is created to add element into the stack
     * @param element - element to add into the stack
     */
    public void push (int element) {
        StackNode node = new StackNode();
        node.data = element;
        node.node = top;
        top = node;
    }

    /***
     * printStack is created to print the stack elements
     */
    public void printStack() {
        StackNode node = top;
        while (node != null) {
            System.out.println( node.data);
            node = node.node;
        }
    }

    /***
     * isEmpty method is created to check whether stack is empty or not
     * @return - top element
     */
    public boolean isEmpty() {
        return top == null;
    }

    /***
     * peak method is created to tell which element is at top of stack
     * @return - top element
     */
    public int peak() {

        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Empty stack");
            return -1;
        }

    }

    /***
     * pop method is created to remove top element from the stack
     */
    public void pop() {

        while (top != null) {
            System.out.println("Peak element :  " + peak());
            top = top.node;
            System.out.println("Element removed");
        }
        System.out.println("Empty stack");
    }
}
