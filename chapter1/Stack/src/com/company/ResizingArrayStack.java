package com.company;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>{


    //这是一个模拟栈（后进先出）的小程序
    //实现判断非空、栈的大小、自动扩充容量、push、pop、迭代的功能

    private Item[] a = (Item[]) new Object[1];//栈元素

    private int N = 1;//表示栈的容量

    public Boolean isEmpty(){
        return N == 0;
    }

    public int length(){
        return N;
    }

    private void resize(int length){

        Item[] tempItem = (Item[]) new Object[length];//长度扩大两倍
        for(int i=0;i < length;i++){
            tempItem[i] = a[i];
        }
        a = tempItem;
    }

    //进
    public void push(Item i){
        if (N == a.length ){
            resize(2*a.length);
        }
        a[N++] = i;
    }

    //出
    public Item pop(Item i){
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4)
            resize(N/2);
        return item;
    }



    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
