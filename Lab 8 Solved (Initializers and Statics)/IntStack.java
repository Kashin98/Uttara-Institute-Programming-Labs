public class IntStack{
    private int[] intStack = new int[10];
    private int currentIndex = 0; // this keeps track of how many items are present in the stack and which stack item
    // we're currently on


    public void push(int number){
        // if currentIndex == 10  or more, the stack is full
        if(currentIndex >= intStack.length){
            System.out.println("IntStack is full");
        }else {
            this.intStack[this.currentIndex] = number;
            this.currentIndex++;
        }
    }

    public void pop(){
        // we can't pop if the stack is empty
        if(this.currentIndex == 0){
            System.out.println("Stack is empty");
        }else{
            // this.currentIndex-- first is because the index is at the next value of stack which is empty and
            // waiting for a new int addition. When we currentIndex--; we go back to previous stack which is what we
            // want to pop.
            this.currentIndex--;
            this.intStack[this.currentIndex] = 0;
        }
    }

    public int peek(){
        if(this.currentIndex > 0){
            // similar to pop, we want to peek at the top item in stack, so we return currentIndex-1 int which is at
            // the top.
            return this.intStack[this.currentIndex-1];
        }else{
            System.out.println("Stack is empty");
            return 0;
        }
    }
}

class TestIntStack{
    public static void main(String[] args) {
        IntStack intStack = new IntStack();
        intStack.pop();
        intStack.push(123);
        intStack.push(312);
        intStack.push(12556);
        intStack.push(525);
        intStack.push(7849);
        intStack.push(123);
        intStack.push(124);
        intStack.push(1556);
        intStack.push(55);
        intStack.push(789);
        intStack.push(225); // doesn't go in, since stack is full, so push operation is rejected.

        System.out.println(intStack.peek()); // 789
        intStack.pop(); // 789 is popped
        intStack.pop(); // 55 is popped
        System.out.println(intStack.peek()); // 1556
    }
}