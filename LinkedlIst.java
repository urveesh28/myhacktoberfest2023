import java.util.*;
public class LinkedlIst {
    //creating Node class
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }

        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        this.size=0;
    }


    //creating first node
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==NULL){
            tail=head;
        }
        size+=1;
    }

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
    }

    
}
