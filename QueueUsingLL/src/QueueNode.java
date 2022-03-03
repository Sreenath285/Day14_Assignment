public class QueueNode {

    MyNode start, end;
    int count = 0;

    /***
     * enQueue method is created to add elements into queue
     * @param data - data is to add in queue
     */
    public void enQueue(int data) {

        MyNode newNode = new MyNode(data);
        if (end == null) {
            end = start = newNode;
            count++;
        }
        else {
            end.next = newNode;
            end = newNode;
            count++;
        }
    }

    /***
     * printQueue method is created to print queue elements
     */
    public void printQueue() {

        MyNode node = start;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }
}
