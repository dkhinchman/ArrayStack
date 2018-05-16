import com.hinchman.arraystack.ArrayStack;

public class ArrayStackMain {
    public static void main(String[] args){
        ArrayStack myStack = new ArrayStack(5);

        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.printStack();

        myStack.peek();

    }



}
