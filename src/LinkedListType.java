public class LinkedListType {
    /*Save address when delete all elements*/
    private static LinkedListType first;

    /*Links to the next node*/
    private LinkedListType next;
    private int data;

    public LinkedListType() {
        first = this;
    }

    private LinkedListType(int data) {
        this.data = data;
        this.next = null;
    }

    /*
    * Append element to tail of the list
    */
    public void appendElement(int data) {
        LinkedListType element = new LinkedListType(data);
        LinkedListType temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = element;
    }

    /*
    * Delete tail element
    */
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

    /*
    * Remove all elements which are greater than a number
    */
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

    /*
    * Print elements in the list
    */
    public void printListContent() {
        LinkedListType temp = first.next;
        String s = "";
        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }

        System.out.println(s);
    }
}
