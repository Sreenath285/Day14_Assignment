public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {
        /***
         *PROCEDURE
         * 1. creating queue
         * 2. adding elements into queue
         * 3. printing elements after adding them into queue
         */

        /***
         * 1. creating queue
         */
        QueueNode queueNode = new QueueNode();

        /***
         * 2. adding elements into queue
         */
        queueNode.enQueue(56);
        queueNode.enQueue(30);
        queueNode.enQueue(70);

        /***
         * 3. printing elements after adding them into queue
         */
        System.out.println("Elements in the queue : ");
        queueNode.printQueue();

    }
}
