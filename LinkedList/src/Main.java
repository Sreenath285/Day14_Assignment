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
         * 4. inserting data in between data
         * 5. printing the linked list after inserting the data
         * 6. ordered linked list (ascending)
         * 7. searching an element
         * 8. deleting specific element
         * 9. deleting first element in linked list
         * 10. printing linked list after deleting first element
         * 11. deleting last element in linked list
         * 12. printing linked list after deleting last element
         */

        /***
         * 1. creating linked list
         */
        MyLinkedList myLinkedList = new MyLinkedList();

        /***
         * 2. adding nodes to the linked list
         */
        myLinkedList.add(56);
        myLinkedList.add(30);
        myLinkedList.add(70);

        /***
         * 3. printing the linked list after adding the nodes
         */
        myLinkedList.printLinkedList();

        /***
         * 4. inserting data in between data
         */
        System.out.println("\nAfter inserting : ");
        myLinkedList.insertBetween(30, 40);

        /***
         *  5. printing the linked list after inserting the data
         */
        myLinkedList.printLinkedList();

        /***
         * 6. ordered linked list (ascending)
         */
        System.out.println("\nOrdered linked list (ascending) : ");
        myLinkedList.orderedLinkedList(myLinkedList);
        myLinkedList.printLinkedList();

        /***
         * 7. searching an element
         */
        myLinkedList.searchElement(30);

        /***
         * 8. deleting specific element
         */
        myLinkedList.deleteSpecificElement(40);

        /***
         * 9. deleting first element in linked list
         */
        System.out.println("\nAfter deleting first element : ");
        myLinkedList.deleteFirstElement();

        /***
         * 10. printing linked list after deleting first element
         */
        myLinkedList.printLinkedList();

        /***
         * 11. deleting last element in linked list
         */
        System.out.println("\nAfter deleting last element : ");
        myLinkedList.deleteLastElement();

        /***
         * 12. printing linked list after deleting last element
         */
        myLinkedList.printLinkedList();

    }
}
