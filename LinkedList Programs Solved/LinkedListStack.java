public class LinkedListStack {
    private int size = 0;
    private Node top;

    public LinkedListStack() {
    }

    public void push(int data) {
        Node n = new Node(data);
        if(top == null){
            top = n;
        }else {
            n.setNext(top);
            top = n;
        }
        size++;
    }

    public void pop() {
        if(top == null){
            System.out.println("Empty Stack");
            return;
        }

        Node removeNode = top;
        top = top.getNext();
        removeNode.setNext(null);

        size--;
    }

    public void peek() {
        if(isEmpty()){
            System.out.println("Empty Stack");
        }else{
            System.out.println(top.getData());
        }
    }

    public void print() {

        if(top == null){
            System.out.println("Empty Stack");
        }else {
            Node temp = top;
            while(temp != null){
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public long getSize() {
        return size;
    }
}

// -----------------------------------TEST CLASS----------------------------------

class TestLLS{
    public static void main(String[] args) {
        LinkedListStack lls = new LinkedListStack();
        lls.push(1);
        lls.push(2);
        lls.push(3);
        lls.push(4);
        lls.print(); // 1 2 3 4

        lls.peek(); // 4 was last pushed so 4 is top
        lls.pop(); // 4 popped
        lls.pop(); // 3 popped
        lls.peek(); // 2 is top now

        System.out.println(lls.getSize()); // size is 2
        lls.pop(); // 2 popped
        lls.pop(); // 1 popped
        System.out.println(lls.isEmpty()); // true
    }
}