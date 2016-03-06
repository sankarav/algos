package edu.ub.san.algos.goodrichbook.chap_3.linkedlist.singlylinkedlist;

/**
 * Created by san on 3/3/16 for algos.
 */
public interface ISinglyLinkedList<E> {
    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E element);

    void addLast(E element);

    E removeFirst();

}
