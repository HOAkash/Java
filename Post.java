import java.util.*;


public class Post {

    int arr[];
    int capacity;
    int top;

    Post() {
        capacity = 10;
        top = -1;
        arr = new int[capacity];
    }


    void push(int num) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = num;
    }


    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }
     void printStack() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.println("Stack elements: ");
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


    
 public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // String input=sc.nextLine();
    // System.out.println("enter the post");
        Post stack = new Post();

    
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);

        
       System.out.println("Initial Stack: ");
    stack.printStack();

    System.out.println("Popped element: " + stack.pop());
    System.out.println("Stack after pop: ");
    stack.printStack();

    }
}

    

