/**
 * Created by User on 9/20/2018.
 */
public class Node {
    int value;

    /**
     * object to hold reference to the next node
     */
    Node next;

    /**
     * constructor to create a new node
     */
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }


    /**
     * method to find the node at the given position n
     */
    public Node nth(int position) {
        if (position == 1) {
            return this;
        } else if ((position < 1) || (next == null)) {
            return null;
        } else {
            return next.nth(position - 1);
        }
    }


}
