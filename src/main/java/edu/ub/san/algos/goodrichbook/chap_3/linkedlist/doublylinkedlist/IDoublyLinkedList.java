package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.doublylinkedlist;

/**
 * Created by san on 3/5/16 for algos.
 */
public interface IDoublyLinkedList<E> {
    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();
}
