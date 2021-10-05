import java.io.*;
   
public class LinkedList {
   
    Node head; 
   
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
      
        if (list.head == null) {
            list.head = new_node;
        }
        else {
           
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }     
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
        while (currNode != null) {
           
            System.out.print(currNode.data + " ");       
            currNode = currNode.next;
        }
    }
    public static void main(String[] args)
    {
      
        LinkedList list = new LinkedList();
   
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}
