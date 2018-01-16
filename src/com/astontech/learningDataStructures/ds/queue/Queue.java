package com.astontech.learningDataStructures.ds.queue;

public class Queue {

    private int maxSize; // inititalizes a set number of slots
    private long[] queArray; // slots to maintain the data
    private int front; // this will be the index position for the element in the front
    private int rear; // going to be the index position for the element at the back of the line
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        this.front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered the last item
        nItems = 0; // we don't have elements in the array yet
    }

    public void insert(long j) {
//        if(rear == maxSize -1) { // circular queue, overwriting each value starting at the beginning
//            rear = -1;           // off the line, after the max size has been reached
//        }                        // THIS IS NOT NECESSARY IF YOU DON'T WANT IT

        if(rear == maxSize -1) {
            System.out.println("The queue is full");

        } else {
            rear++;
            queArray[rear] = j;
            nItems++;
        }
    }

    public long remove() {  // remove item from the front of the queue
        long temp = queArray[front];
        front++;
        if(front==maxSize){
            front = 0; // set front back to the 0th index so that we can utilize the entire array again
        }
        nItems --;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i]+" ");
        }
        System.out.println("]");
    }

}
