import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top = null;

    public void push(int y) {
        Node sn = new Node(y);

        if (top == null) {
            top = sn;
        } else {
            sn.next = top;
            top = sn;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            top = top.next;
        }
    }
    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack s = new Stack();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            s.push(10);
            s.push(20);
            s.push(30);
        }
        s.peek();
        s.pop();
        s.display();
        System.out.println("Stack elements:");
        
    }
}