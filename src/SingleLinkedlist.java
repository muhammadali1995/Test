/**
 * Created by User on 9/20/2018.
 */
public class SingleLinkedlist {

    public Node head;

    public int size;

    public SingleLinkedlist() {
        head = null;
        size = 0;
    }

    /**
     * add an new node to the end of the singly linkedlist
     * time: O(N)
     */
    public void append(int value) {
        Node tail = this.head;
        for (int i = 1; i < this.size; i++) {
            tail = tail.next;
        }
        if (tail == null) {
            this.head = new Node(value, null);
        } else {
            tail.next = new Node(value, null);
        }
        this.size++;
    }

    /**
     * removes the tail of the singly linkedlist and decreases the size
     * * time: O(N)
     */
    public void revoveTail() {
        Node node = head.nth(size);
        head.nth(size - 1).next = null;
        size--;
    }

    /**
     * removes all the items that are greater than the given value
     * time: O(N)
     */
    public void removeGreaterThanTarget(int target) {
        Node dummy = new Node(-1, head);
        Node tempNode = dummy;
        while (tempNode.next != null) {
            if (tempNode.next.value > target) {
                tempNode.next = tempNode.next.next;
                size--;
            } else {
                tempNode = tempNode.next;
            }
        }

        head = dummy.next;
    }


}
