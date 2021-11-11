public class SinglyLinkedList implements LinkedList{
    private int size = 0;
    private Node head;
    private Node last;

    public SinglyLinkedList() {}

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(int data) {
        /* Create a node with given data first
         * check if the head node is null to make sure if this is a empty linkedlist or not
         * if LinkedList is empty then new node being added is head node and last node
         * if it's not empty linked list then navigate to last node and get last.setNext to point to new node
         * next get last to point to new node.
         * increase size by +1 */

        Node n = new Node(data);
        if(head == null){
            head = last = n;
        } else{
            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public void print() {
        /*Check if head node is null, if it is print empty
         * Else start from head node
         * keep going to next as long there is a next and print its data */
        if(head == null){
            System.out.println("Empty LinkedList");
        }else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
        }
        System.out.println();
    }

    @Override
    public boolean contains(int data) {
        /*Check if head node is empty, return false if empty
         * Else, start from head node and go through all node as long as there is a next
         * check if any node has same data as passed data in parameter */

        if(head == null){
            return false;
        }
        Node temp = head;
        while (temp != null){
            if(temp.getData() == data) return true;
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public void insert(int data, int position) {
        /*Check if head is null and also if position is greater than equal to size or less than 0
         * Create new node with given data.
         * start loop until you reach the position and get the node before the required position
         * now take node.setNext() and point it to temp.getNext()
         * temp.setNext() and point it to node n
         * Increase size by +1 */

        // Problem, according to the written code, if a user tries to set position to 0, it does not set the node
        // at position zero and the head node will not be changed. The last position is not to be concerned with as just
        // using add method will add the node to last position, insert doesn't need this feature. We just need to fix
        // code to be able to insert a node into 0th or head position.

        if(head == null || position >= size || position < 0){
            throw new ArrayIndexOutOfBoundsException("Position given is out of bounds");
        }
        Node n = new Node(data);
        Node temp = head;
        // fix to insert element into 0th or head position
        if(position == 0){
            n.setNext(head);
            head = n;
        }else {
            for(int i = 0; i < position-1; i++){
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
        }
        size++;
    }

    @Override
    public void remove(int position) {
        /* Check if head is null and also if position is greater than equal to size or less than 0.
         * start loop until you reach the position and get the node (temp) before the required position.
         * get temp.getNext and add it to new Node refvar removeNode.
         * now temp.setNext will be set to temp.getNext.getNext.
         * then set removeNode refvar to null.
         * Reduce size by 1 */

        // As the previous method we have similar problems in this code. Here we need to worry about head position as
        // well. The last position removal is resolved by the normal code.

        if(head == null || position >= size || position < 0){
            throw new ArrayIndexOutOfBoundsException("Position out of bounds");
        }
        if(position == 0){
            Node removeNode = head;
            head = head.getNext();
            removeNode.setNext(null);
        }else {
            Node temp = head;
            for (int i = 0; i < position-1; i++){
                temp = temp.getNext();
            }
            Node removeNode = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            removeNode.setNext(null); // removes node from list
        }
        size--;
    }

    @Override
    public int get(int position) {
        /*Check if head is null, if yes list is empty throw index out of bounds exception.
         * You can't get position if you haven't added data or given wrong position, don't pass -1, silent failure
         * if all input validations passed then start loop and check from head pos 0 until node before pos
         * return node.getNext.getData() */

        if(head == null || position >= size || position < 0){
            throw new ArrayIndexOutOfBoundsException("Position given is out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < position; i++ ){
            temp = temp.getNext();
        }
        return temp.getData();
    }

    // Makes Linked List a cyclic Linked List
    public boolean makeListCyclic(){
        /*Check if list is empty
        * To make the cycle completely random, we'll create a for loop
        * the loop will choose a random position and the last node's next will point to that node
        * this will create a cycle in list (The cycle can exist in the middle with random nodes as well) */

        if(head == null){
            return false;
        }
        Node temp = head;
        for(int i = 0; i<((int)(Math.random()*1*size)); i++){
            temp = temp.getNext();
        }
        last.setNext(temp);
        return true;
    }
}

// -----------------------------------TEST CLASS----------------------------------

class TestSLL{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.print();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.insert(10,0); // adds node 10 to head position
        sll.print();
        sll.remove(sll.getSize()-1); // removes the last node from list
        sll.print();
        sll.remove(0); // removes the head node from list
        sll.print();
        System.out.println("Size of List is "+ sll.getSize());

        // Checking if it shows in contains after inserting and removing the nodes.
        System.out.println(sll.contains(4));
        System.out.println(sll.contains(10));

        // Getting first and last position
        System.out.println(sll.get(0));
        System.out.println(sll.get(sll.getSize()-1));
    }
}

class SLLNewMethodsTest{
    public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.add(1);
    sll.add(2);
    sll.add(3);
    sll.add(4);
    sll.add(5);
    sll.print();

    // This method was specifically built to solve this problem. It makes our list a cyclicLinkedList.
    sll.makeListCyclic(); // Do not use when calling middle node and print reverse method.
    System.out.println(isListCyclic(sll));

    System.out.println(findMiddleNode(sll).getData());

    printReverseLinkedList(sll, sll.getHead());
    }

    // Check if the Linked List is cyclic
    public static boolean isListCyclic(SinglyLinkedList sll){
        /*To check if a list is cyclic we first check if the list is empty
         * If not empty, we create two pointer called fast and slow
         * we create a while loop, in the loop fast pointer will move two nodes and slow will move one node
         * We keep checking in fast pointer ever reaches a null
         * At the same time every loop we check if slow point and fast point are pointing to same node address
         * If a list cyclic, eventually fast pointer will point to the same node as slow during loop iterations
         * If they both point to same node, that means the list cyclic, else the fast pointer will reach null
         * making the list non-cyclic*/

        if(sll.getHead() == null){
            return false;
        }
        Node slow = sll.getHead();
        Node fast = sll.getHead();
        while (fast != null){
            if(fast.getNext() == null || fast.getNext().getNext() == null){
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Return middle node of the LinkedList
    public static Node findMiddleNode(SinglyLinkedList sll){
        /*First we check if the list is empty
         * if not, we create two pointers fast and slow
         * In a while loop fast will traverse 2 nodes per iteration while slow only traverses 1 node
         * once the fast reaches the end, we just return slow, this will return our middle node
         * since slow will always land in the middle while fast reaches the end of list */

        if(sll.getHead() == null){
            throw new ArrayIndexOutOfBoundsException("Empty LinkedList passed");
        }

        Node slow = sll.getHead();
        Node fast = sll.getHead();

        while (fast != null){
            if(fast.getNext() == null || fast.getNext().getNext() == null){
                return slow;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    // Print the nodes of Linked List in reverse
    public static void printReverseLinkedList(SinglyLinkedList sll, Node temp){
        /*We're solving this using recursion
         * check if list is empty
         * if no empty, create temp node and point to node
         * then check if temp.next is empty, return if empty
         * if not, call method again (recursive call)
         * after recursive call, print temp.next.data
         * When method starts it will keep recursively calling itself until the condition temp.next == null is met
         * once we reach end of list, we return from the method, ending recursive call and going back to prev frame
         * this will start a linear path of each method printing its next value and going back to prev frame
         * until we reach back to our first method */

        if(sll.getHead() == null){
            System.out.println("Empty LinkedList");
            return;
        }

        if(temp == null){
            return;
        }
        printReverseLinkedList(sll,temp.getNext());
        System.out.print(temp.getData() + " ");
    }
}