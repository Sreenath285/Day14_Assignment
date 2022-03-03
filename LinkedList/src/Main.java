public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {
        /***
         * PROCEDURE
         * 1. creating linked list
         * 2. adding nodes to the linked list
         * 3. printing the linked list after adding the nodes
         */

        /***
         * 1. creating linked list
         */
        MyLinkedList myLinkedList = new MyLinkedList();

        /***
         * 2. adding nodes to the linked list
         */
        MyNode head = myLinkedList.add(null, 56);
        myLinkedList.add(head, 30);
        myLinkedList.add(head, 70);

        /***
         * 3. printing the linked list after adding the nodes
         */
        myLinkedList.printLinkedList(head);
    }
}
