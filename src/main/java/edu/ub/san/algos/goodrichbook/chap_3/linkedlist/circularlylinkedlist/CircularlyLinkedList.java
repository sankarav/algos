package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.circularlylinkedlist;

/**
 * Created by san on 3/5/16 for algos.
 */
public class CircularlyLinkedList<E> implements ICircularlyLinkedList<E> {
    private int size;
    private Node<E> tail;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        else
            return tail.getNext().getElement();
    }

    @Override
    public E last() {
        if (isEmpty())
            return null;
        else
            return tail.getElement();
    }

    @Override
    public void rotate() {
        if (!isEmpty())
            tail = tail.getNext();
    }

    @Override
    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> temp = new Node<>(element, tail.getNext());
            tail.setNext(temp);
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        addFirst(element);
        tail = tail.getNext();
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;

        Node<E> head = tail.getNext();
        if(head == tail)
            tail = null;
        else
            tail.setNext(head.getNext());

        size--;
        return head.getElement();
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {

            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
