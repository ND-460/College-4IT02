import java.util.*;
class Stack{
    int []arr;
    int top;
    int size;
    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    void push(int x){
        if(top == size - 1){
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
        }
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }
    int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    boolean isEmpty(){
        return top == -1;
    }
    int size(){
        return top + 1;
    }
    public static void main(String[] args) {
        System.out.println("By 22IT460");
        Stack stack = new Stack(15);
        stack.push(10);
        stack.push(20);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());       
    }    
}