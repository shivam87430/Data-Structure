package linkedlist;

public class FindMiddleValueOfLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Addition addition = new Addition();
        addition.simpleInsertion(singlyLinkedList);
        SinglyLinkedList.ListNode middleNode = singlyLinkedList.findMiddleOfLinkedList();
        System.out.println(middleNode.data);
    }

}
