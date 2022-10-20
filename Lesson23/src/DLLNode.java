public class DLLNode <T> {
    T data;
    DLLNode<T> next;
    DLLNode<T> previous;

    public DLLNode(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

}