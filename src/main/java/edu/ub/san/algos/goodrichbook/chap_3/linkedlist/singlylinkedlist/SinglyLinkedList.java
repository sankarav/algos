package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.singlylinkedlist;

/**
 * Created by san on 3/3/16 for algos.
 */
public class SinglyLinkedList<E> implements ISinglyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if(isEmpty())
            return null;
        else
            return head.getElement();
    }

    @Override
    public E last() {
        if (isEmpty())
            return null;
        else
            return tail.getElement();
    }

    @Override
    public void addFirst(E element) {
        head = new Node<>(element, head); //RHS is evaluated before LHS
        if (isEmpty()) //List was Empty before so tail gets to point to newly added Element too
            tail = head;
        size++;
    }

    @Override
    public void addLast(E element) {
        if(isEmpty()){ //addLast is same as addFirst if list is empty
            addFirst(element);
        } else {
            Node<E> newNode = new Node<>(element, null);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;
        else {
            E out = head.getElement();
            head = head.getNext();
            size--;
            if(isEmpty()) //If 1 elem list becomes 0, tail might leak memory. So null tail
                tail = null;
            return out;
        }
    }

    private static class Node<E>{
        private E element;
        private Node<E> next;

        private Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        private E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
