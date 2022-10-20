public interface InterfaceDoubleLinkedList<T> {
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
    void removeAll();
    T getFirst();
    T getLast();
    boolean isEmpty();
}
