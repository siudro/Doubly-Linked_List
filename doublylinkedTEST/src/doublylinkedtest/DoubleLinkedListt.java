package doublylinkedtest;

class DoublyLinkedListt<T> {

    DNode head;

    public DoublyLinkedListt() {
    }

    public void insertFirst(T new_data) {

        DNode new_Node = new DNode(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) {
            head.prev = new_Node;
        }

        head = new_Node;

    }

    public void InsertAfter(T preEle, T newEle) {

        DNode new_node = new DNode(newEle);

        DNode current = head;
        while (current.next != null && !current.element.equals(preEle)) {
            current = current.next;
        }

        if (current.element.equals(preEle)) {

            current.next.prev = new_node;
            new_node.next = current.next;
            new_node.prev = current;
            current.next = new_node;

        }

    }

    void insertLast(T new_data) {

        DNode new_node = new DNode(new_data);

        DNode last = head;

        new_node.next = null;

        if (head == null) {

            new_node.prev = null;

            head = new_node;
            return;

        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;

        new_node.prev = last;

    }

    boolean deleteNode(T target) {

        if (head == null || target == null) {

            return false;

        }

        if (head.element.equals(target)) {

            head = head.next;

            head.prev = null;

            return true;

        }

        DNode current = head;

        while (current.next != null && !current.element.equals(target)) {
            current = current.next;
        }

        if (current.next == null && current.element.equals(target)) {

            current.prev.next = current.next;

            return true;

        }

        if (current.next != null && current.element.equals(target)) {

            current.next.prev = current.prev;

            current.prev.next = current.next;

            return true;

        }

        return false;

    }

    public void printlist(DNode node) {

        DNode last = null;
        System.out.println("Traversing the Doubly Linked List:");
        while (node != null) {

            System.out.print(node.element + "->");
            last = node;
            node = node.next;

        }
        System.out.println("null");

    }
    public void display() {
        DNode cur = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }
        System.out.println("Traversing the Doubly Linked List: ");
        while (curr!= null) {
            System.out.print(curr.element + "->");
            curr = curr.next;
        }
    } 

    class DNode<T> {

        protected T element;
        protected DNode next, prev;

        public DNode(T e) {
            element = e;
            prev = null;
            next = null;

        }

    }
}
