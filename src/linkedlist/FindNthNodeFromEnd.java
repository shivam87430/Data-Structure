package linkedlist;

public class FindNthNodeFromEnd {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Addition addition = new Addition();
        addition.simpleInsertion(singlyLinkedList);
        int value = 3;
        SinglyLinkedList.ListNode lastNthNodeFromEnd =  singlyLinkedList.getNthNdeFromEnd(value);
        System.out.println("Last " + value + " Node From End -> " + lastNthNodeFromEnd.data);
    }
}
