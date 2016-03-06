package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.doublylinkedlist;

/**
 * Created by san on 3/5/16 for algos.
 */
public class DoublyLinkedList<E> implements IDoublyLinkedList<E> {
    private int size;
    private final Node<E> header;
    private final Node<E> trailer;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    @Override
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    @Override
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    private void addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> temp = new Node<>(e, pred, succ);
        pred.setNext(temp);
        succ.setPrev(temp);
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        return removeNode(header.getNext());
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        return removeNode(trailer.getPrev());
    }

    private E removeNode(Node<E> node) {
        Node<E> pred = node.getPrev();
        Node<E> succ = node.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
        size--;
        return node.getElement();
    }

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }
    }
}
