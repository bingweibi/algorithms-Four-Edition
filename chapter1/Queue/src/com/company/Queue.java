package com.company;

import java.util.Iterator;

/**
 * Created by bbw on 2017/7/13.
 * 队列实现
 * 实现长度、非空、添加、删除
 */
public class Queue<Item> implements Iterable<Item>{


    private Node first;
    private Node last;
    private int length = 0;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void enQueue(Item item){
        //添加
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            last = first;
        else
            oldLast.next = last;
        length++;
    }

    public Item deQueue(){
        //删除
        Item item = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        length--;
        return item;

    }
    @Override
    public Iterator<Item> iterator() {

        return new ListIterator() ;
    }
    private class ListIterator<Item> implements Iterator<Item>{

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {

            Item item = (Item) current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }
}
