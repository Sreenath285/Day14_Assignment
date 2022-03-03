public class MyLinkedList {
    MyNode head;

    /***
     * add method is created to add data to linked list
     * @param data - accepting data to put it in linked list
     */
    public void add(int data) {

        MyNode newNode = new MyNode(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            MyNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }


    /***
     * print linked list method is created to print linked list after adding nodes
     */
    public void printLinkedList() {

        MyNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

    }

    /***
     * insertBetween method to insert data in between data in the linked list
     * @param position - to insert data after the position
     * @param data - data to be inserted in the linked list
     */
    public void insertBetween(int position, int data) {

        MyNode tempNode = head;
        MyNode newNode = new MyNode(data);
        while(tempNode.data != position) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        newNode.next  = tempNode.next;
        tempNode.next = newNode;
    }

    /***
     * deleteFirstElement method is created to delete first element in linked list
     */
    public void deleteFirstElement() {

        MyNode tempNode = head.next;
        head.next = null;
        head = tempNode;
    }

    /***
     * deleteLastElement method is created to delete last element in linked list
     */
    public void deleteLastElement() {

        MyNode tempNode = head;
        MyNode previousNode = null;
        while (tempNode.next != null) {
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
        previousNode.next = null;
    }
}
