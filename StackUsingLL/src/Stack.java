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

}
