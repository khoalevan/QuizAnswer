public class Main {

    public static void main(String[] args) {
        LinkedListType linkedList = new LinkedListType();

        linkedList.appendElement(5);
        linkedList.appendElement(2);

        linkedList.printContent();

        linkedList.deleteTailElement();
        linkedList.printContent();
        linkedList.deleteTailElement();
        linkedList.printContent();

        linkedList.appendElement(1);
        linkedList.appendElement(2);
        linkedList.appendElement(3);
        linkedList.appendElement(4);
        linkedList.appendElement(5);

        linkedList.removeElementGreaterThan(3);
        linkedList.printContent();
    }
}
