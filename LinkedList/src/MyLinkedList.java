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

    /***
     * searchElement method is created to search given element
     * @param myLinkedList - searching through the linked list
     * @param data - data to search in the linked list
     */
    public void searchElement(MyLinkedList myLinkedList, int data) {

        MyNode currentNode = myLinkedList.head;
//        MyNode previousNode = null;
        while (currentNode != null && currentNode.data != data){
            currentNode = currentNode.next;
        }
        System.out.print("\nSearched element : " + currentNode.data);
    }

    /**
     * deleteSpecificElement method is created to delete specific element
     * @param data - element to be deleted
     */
    public void deleteSpecificElement(int data) {

        MyNode currentNode = head;
        MyNode previousNode = null;
        while (currentNode != null && currentNode.data != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            System.out.print("\nDeleted element : " + data);
            previousNode.next = currentNode.next;
        }
    }
    
    public void orderedLinkedList(MyLinkedList myLinkedList) {

        MyNode currentNode = head;
        int temp;
        MyNode index;
        while (currentNode != null) {
            index = currentNode.next;
            while (index != null) {
                if (currentNode.data > index.data) {
                    temp = currentNode.data;
                    currentNode.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            currentNode = currentNode.next;
        }
    }
}
