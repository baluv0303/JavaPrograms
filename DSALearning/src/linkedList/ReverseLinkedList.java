package linkedList;

public class ReverseLinkedList {

    public static Node reverse(Node head){
        Node current=head, prev =null, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev =current;
            current = next;

        }
        return prev;

    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}

//Complexity
//Time = O(n);
//Space = O(1)



