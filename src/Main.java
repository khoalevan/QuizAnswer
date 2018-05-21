public class Main {

    public static void main(String[] args) {
        LinkedListType linkedList = new LinkedListType();

        /*Linked list appending*/
        linkedList.appendElement(5);
        linkedList.appendElement(2);

        System.out.println("======Append elements=====\nList's content: ");
        linkedList.printListContent();

        /*Linked list deleting*/
        linkedList.deleteTailElement();
        System.out.println("======Delete tail element=====\nList's content: ");
        linkedList.printListContent();
        // Delete the last element. List go to empty
        linkedList.deleteTailElement();
        System.out.println("======Delete tail element=====\nList's content: ");
        linkedList.printListContent();

        /*Linked list remove elements which are greater than a number*/
        linkedList.appendElement(5);
        linkedList.appendElement(2);
        linkedList.appendElement(3);
        linkedList.appendElement(4);
        linkedList.appendElement(1);

        linkedList.removeElementGreaterThan(3);
        System.out.println("======Delete elements with condition=====\nList's content: ");
        linkedList.printListContent();
    }
}
