public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        /***
         *PROCEDURE
         * 1. creating stack
         * 2. pushing elements into stack
         * 3. printing elements after pushing them into stack
         */

        /***
         * 1. creating stack
         */
        Stack stack = new Stack();

        /***
         * 2. pushing elements into stack
         */
        stack.push(70);
        stack.push(30);
        stack.push(56);

        /***
         * 3. printing elements after pushing them into stack
         */
        stack.printStack();

    }
}
