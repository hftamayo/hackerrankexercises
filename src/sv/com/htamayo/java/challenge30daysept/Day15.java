package sv.com.htamayo.java.challenge30daysept;
/*
Day 15:
https://www.hackerrank.com/challenges/30-linked-list/problem?isFullScreen=false
30 of 30
*/
public class Day15{
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node new_node = new Node(data);
        new_node.data = data;
        /*inserting at the beginning of a LinkedList
        new_node.next = head;
        head = new_node;
        */
        //inserting node at tail
        if (head == null) {
            head = new Node(data);
            return head;
        }

        new_node.next = null;
        Node last = head;

        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return head;
    }
}

