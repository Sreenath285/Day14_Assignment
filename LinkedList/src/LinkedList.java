public class LinkedList {
    /**
     * head of the list
     */
    MyNode head;

    /***
     * created static inner class
     */
    static class MyNode {
        int data;
        MyNode next;

        /***
         * created a constructor
         */
        public MyNode(int data) {
            this.data = data;
            next = null;
        }
    }

    /***
     * created printList method to print linked list data
     */
    private void printList() {
        MyNode tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    /***
     * main method for linkedlist
     * @param args - default parameters(not used)
     */
    public static void main(String[] args) {
        /***
         * PROCEDURE
         * 1. creating linked list
         * 2. adding nodes to linked list
         * 3. printing linked list after adding nodes
         */

        /***
         * 1. creating linked list
         */
        LinkedList linkedListLinkedList = new LinkedList();

        /***
         * 2. adding nodes to the linked list
         */
        linkedListLinkedList.head = new MyNode(56);
        MyNode second = new MyNode(30);
        MyNode third = new MyNode(70);
        linkedListLinkedList.head.next = second;
        second.next = third;

        /***
         * 3. printing linked list after adding nodes
         */
        linkedListLinkedList.printList();
    }
}
