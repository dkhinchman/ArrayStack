package com.hinchman.arraystack;

public class ArrayStack {
    private int top;
    private int capacity;
    private int[] myStack;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        myStack = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if(top == capacity - 1)
            System.out.println("Stack is full. Cannot push a value.");
        else{
            top = top + 1;
            myStack[top] = value;
        }
    }

    public void pop(){
        if(!isEmpty())
            top = top - 1;
        else{
            System.out.println("Stack is empty. No popping");
        }
    }

    public void peek(){
        System.out.println(myStack[top]);
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.print(myStack[i] + " ");
        }
        System.out.println();
    }
}
