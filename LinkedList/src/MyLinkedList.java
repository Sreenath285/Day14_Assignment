public class MyLinkedList {

    /***
     * add method is created to add data to linked list
     * @param head - accepting head pointer of linked list to manipulate it
     * @param data - accepting data to put it in linked list
     * @return head - returns head of linked list
     */
    public MyNode add(MyNode head, int data) {

        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
        }
        else {
            MyNode tempNode = head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        return head;
    }

    /***
     * print linked list method is created to print linked list after adding nodes
     * @param head - head pointer of linked list to manipulate
     */
    public void printLinkedList(MyNode head) {

        MyNode tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }
}
