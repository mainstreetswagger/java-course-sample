package Iterables;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {

    private E[] elements;
    private int size;
    private int currentIndex;

    public MyIterator(E[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currentIndex + 1 < size;
    }

    @Override
    public E next() {
        if(hasNext()) {
            currentIndex++;
            return elements[currentIndex];
        }
        return null;
    }
}
