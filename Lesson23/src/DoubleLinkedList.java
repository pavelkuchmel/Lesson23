import javax.xml.soap.Node;

public class DoubleLinkedList<T> implements InterfaceDoubleLinkedList<T> {
    private DLLNode<T> head;
    private DLLNode<T> tail;

    public DoubleLinkedList(){
        head = null;
        tail = null;
    }


    @Override
    public void addFirst(T data) {
        DLLNode<T> newNode = new DLLNode<T>(data);
        if (isEmpty()) head = tail = newNode;
        else{
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        DLLNode<T> newNode = new DLLNode<T>(data);
        if (isEmpty()) head = tail = newNode;
        else{
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    @Override
    public void removeFirst() {
        if (!isEmpty()){
            if (head == tail) {head = tail = null;}
            else {
                head = head.next;
                head.previous.next = null;
                head.previous = null;
            }
        }
    }

    @Override
    public void removeLast() {
        if (!isEmpty()){
            if (head == tail) {head = tail = null;}
            else {
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
            }
        }
    }

    @Override
    public void removeAll() {
        DLLNode<T> current = head;
        while (current != null){
            current = current.next;
            current.previous.next = null;
            current.previous = null;
        }
        head = tail = null;
    }

    @Override
    public T getFirst() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return head.data;
    }

    @Override
    public T getLast() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return tail.data;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        DLLNode<T> current = head;
        while (current != null){
            buff.append(current.data);
            buff.append(' ');
            current = current.next;
        }
        return buff.toString();
    }
}
