/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author Dennis
 */
public class LinkedList {

    private Node head;
    private int numNodes;

    public LinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addAtHead(Object data) {

        head = new Node(data, head);
        numNodes++;

    }

    public void addAtTail(Object data) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            prev = current;
            current = current.next;

        }
        if (prev == null) {
            head = new Node(data, null);
        } else {
            prev.next = new Node(data, null);
        }
        numNodes++;

    }

    public Object takeFirst() throws NoSuchElementException {
        if (isEmpty(this)) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        head = head.next;
        numNodes--;
        return temp;
    }

    public Object takeLast() throws NoSuchElementException {
        if (isEmpty(this)) {
            throw new NoSuchElementException("List is empty");
        }
        Node beforePrev = null;
        Node prev = null;
        Node current = head;
        while (current != null) {
            beforePrev = prev;
            prev = current;
            current = current.next;
        }
        if (beforePrev == null) {
            current = prev;
            prev = null;
            Node res = current;
            current = null;
            numNodes--;
            return res;
        }

        current = beforePrev;

        current.next = null;

        numNodes--;

        return prev;
    }

    public void printList() throws NoSuchElementException {
        if (isEmpty(this)) {
            throw new NoSuchElementException("List is empty");
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public boolean isEmpty(LinkedList list) {
        return list.getSize() == 0;
    }

    public int getSize() {
        return numNodes;
    }

    private static class Node {

        private Node next;
        private Object data;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return "" + data;
        }

    }
}
