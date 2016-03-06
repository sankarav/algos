package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.circularlylinkedlist;

/**
 * Created by san on 3/5/16 for algos.
 */
public interface ICircularlyLinkedList<E> {
    int size();

    boolean isEmpty();

    E first();

    E last();

    void rotate();

    void addFirst(E element);

    void addLast(E element);

    E removeFirst();
}
