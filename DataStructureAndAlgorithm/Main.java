package DataStructureAndAlgorithm;

import java.util.Scanner;

public class Main {
    static class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }

        Node head = next;

    }

    static Node head = null;

    public static void creatNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int value = sc.nextInt();
        Node newnNode = new Node(value);
        Node nextNode=new Node(value);

        if (head == null) {
            head = newnNode;
            head=nextNode;

        } else {
            newnNode.next = head;
            head = newnNode;
            nextNode.next=head;
            head=nextNode;
        }

    }
public void insertatend(){
    Node temp=head;
    Node newNode=new Node(100);
    
    while (temp.next!= null) {
        temp=temp.next;
        
    }
    temp.next=newNode;

}
public void insertatmiddle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter position to insert node");
    int position=sc.nextInt();
    Node middle=head;
    Node middleNode=new Node(10);
   
   for(int i=0; i<position; i++){
    middle=middle.next;
   }

   middleNode.next=middle.next;
   middle.next=middleNode;
}

public void insertatbegining(){
    Node temp=head;
    Node nexNode=new Node(200);

    while (temp.next!=null) {
        temp=temp.next;
        
    }
    temp.next=nexNode;
}


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }
    public void deleteNode(int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("delete the node you want");
        int node=sc.nextInt();
        Node deleteNode=new Node(i);
        deleteNode(1);
        for(int k=0; k<node; k++){
            
        }
        

    }

    public static void main(String[] args) {
        Main t = new Main();
        t.creatNode();
       t.creatNode();
        t.creatNode();
        t.creatNode();
        t.insertatend();
        t.insertatmiddle();
       t.insertatbegining();
       t.deleteNode(1);
        t.display();
       
    }

}
