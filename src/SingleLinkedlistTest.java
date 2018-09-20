/**
 * Created by User on 9/20/2018.
 */
public class SingleLinkedlistTest {
    public static void main(String[] args) {
        SingleLinkedlist linkedlist = new SingleLinkedlist();
        linkedlist.append(2);
        linkedlist.append(3);
        linkedlist.append(4);
        linkedlist.append(5);
        linkedlist.append(6);
        linkedlist.removeGreaterThanTarget(5);
        linkedlist.append(12);
    }
}
