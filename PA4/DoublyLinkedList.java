/*
 * NAME: TODO
 * PID: TODO
 */

import java.util.AbstractList;

/**
 * TODO
 * @author TODO
 * @since TODO
 */
public class DoublyLinkedList<T> extends AbstractList<T> {

    /* DLL instance variables */
    private int nelems;
    private Node head;
    private Node tail;

    /**
     * Node for chaining together to create a linked list
     */
    protected class Node {

        /* Node instance variables */
        T data;
        Node next;
        Node prev;

        /**
         * Constructor to create singleton Node
         */
        private Node(T element) {
            // TODO: complete constructor
        }

        /**
         * Constructor to create singleton link it between previous and next
         *
         * @param element  Element to add, can be null
         * @param nextNode successor Node, can be null
         * @param prevNode predecessor Node, can be null
         */
        private Node(T element, Node nextNode, Node prevNode) {
            // TODO: complete implementation
        }

        /**
         * Set the element
         *
         * @param element new element
         */
        public void setElement(T element) {
            // TODO: complete implementation
        }

        /**
         * Accessor to get the Nodes Element
         */
        public T getElement() {
            // TODO: complete implementation
            return null;
        }

        /**
         * Set the next node in the list
         *
         * @param n new next node
         */
        public void setNext(Node n) {
            // TODO: complete implementation
        }

        /**
         * Get the next node in the list
         *
         * @return the successor node
         */
        public Node getNext() {
            // TODO: complete implementation
            return null;
        }

        /**
         * Set the previous node in the list
         *
         * @param p new previous node
         */
        public void setPrev(Node p) {
            // TODO: complete implementation
        }


        /**
         * Accessor to get the prev Node in the list
         *
         * @return predecessor node
         */
        public Node getPrev() {
            // TODO: complete implementation
            return null;
        }

        /**
         * Remove this node from the list.
         * Update previous and next nodes
         */
        public void remove() {
            // TODO: complete implementation
        }
    }

    /**
     * Creates a new, empty doubly-linked list.
     */
    public DoublyLinkedList() {
        // TODO: complete default constructor
    }

    /**
     * Add an element to the end of the list
     *
     * @param element data to be added
     * @return whether or not the element was added
     * @throws NullPointerException if data received is null
     */
    @Override
    public boolean add(T element) throws NullPointerException {
        // TODO: Implementation for throwing exceptions followed by
        // implementation of adding the new data
        return true;
    }


    /**
     * Adds an element to a certain index in the list, shifting exist elements
     * create room. Does not accept null values.
     *
     * TODO: Javadoc comments
     */
    @Override
    public void add(int index, T element)
            throws IndexOutOfBoundsException, NullPointerException {
        // TODO: Implementation for throwing exceptions followed by
        // implementation of adding the new data
    }

    /**
     * Clear the linked list
     */
    @Override
    public void clear() {
        // TODO: implement clear
    }

    /**
     * Determine if the list contains the data element anywhere in the list.
     *
     * TODO: Javadoc comments
     */
    @Override
    public boolean contains(Object element) {
        T data = (T) element;
        // TODO: Fill in implementation
        return false;
    }

    /**
     * Retrieves the element stored with a given index on the list.
     *
     * TODO: Javadoc comments
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        // TODO: Fill in implementation to get the node at index
        return null;
    }

    /**
     * Helper method to get the Nth node in our list
     *
     * TODO: Javadoc comments
     */
    private Node getNth(int index) {
        // TODO: implement
        return null;
    }

    /**
     * Determine if the list empty
     *
     * TODO: javadoc comments
     */
    @Override
    public boolean isEmpty() {
        // TODO: implement isEmpty
        return true;
    }

    /**
     * Remove the element from position index in the list
     *
     * TODO: javadoc comments
     */
    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        // TODO: Fill in implementation
        return null;
    }

    /**
     * Set the value of an element at a certain index in the list.
     *
     * TODO: javadoc comments
     */
    @Override
    public T set(int index, T element)
            throws IndexOutOfBoundsException, NullPointerException {
        // TODO: Fill in implmentation
        return null;
    }

    /**
     * Retrieves the amount of elements that are currently on the list.
     *
     * TODO: javadoc comments
     */
    @Override
    public int size() {
        // TODO: complete implementation
        return 0;
    }

    /**
     * String representation of this list in the form of:
     * "[(head) -> elem1 -> elem2 -> ... -> elemN -> (tail)]"
     *
     * TODO: javadoc comments
     */
    @Override
    public String toString() {
        return null;
    }

    /* ==================== EXTRA CREDIT ==================== */

    /**
     * Mimic Python list slicing, modify list in place
     *
     * TODO: javadoc comments
     */
    public void slice(int start, int end, int step) {
        // TODO: complete implementation       
    }

    /**
     * Recursively swaps halves of list for n recursive layers
     *
     * TODO: javadoc comments
     */
    public void swapHalves(int n, int start, int end) {
        // TODO: complete implementation
    }

}
