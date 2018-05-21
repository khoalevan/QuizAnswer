public class LinkedListType {
    private static LinkedListType first;
    private LinkedListType next;
    private int data;

    public LinkedListType() {
        first = this;
    }

    private LinkedListType(int data) {
        this.data = data;
        this.next = null;
    }

    public void appendElement(int data) {
        LinkedListType element = new LinkedListType(data);
        LinkedListType temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = element;
    }

    public void deleteTailElement() {
        if (first.next == null) return;
        LinkedListType temp = first;
        LinkedListType previous = first;

        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }

        previous.next = null;
    }

    public void removeElementGreaterThan(int data) {
        if (first.next == null) return;

        LinkedListType previous = first;
        LinkedListType temp = first.next;

        do {
            if (temp.data > data) {
                temp = temp.next;
                previous.next = temp;
            } else {
                previous = temp;
                temp = temp.next;
            }
        } while (temp != null);
    }

    public void printContent() {
        LinkedListType temp = first.next;
        String s = "";
        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }

        System.out.println(s);
    }
}
