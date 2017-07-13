package com.company;

import java.util.Iterator;

/**
 * Created by bbw on 2017/7/13.
 * 下压堆栈，链表实现
 * 实现长度、pop、push、非空
 */
public class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int length;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        //非空
        return length == 0;
    }

    public void push(Item item){
        //加入
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        length++;
    }

    public Item pop(){
        //删除
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            first = null;
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
