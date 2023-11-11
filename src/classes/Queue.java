/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author juand
 */
public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public T peek() {
        return isEmpty() ? null : front.getData();
    }
    public int length() {
        int length = 0;
        Node<T> current = front;

        while (current != null) {
            length++;
            current = current.getNext();
        }

        return length;
    }
}
