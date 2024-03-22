package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {
    private List<T> elements;

    public Bag() {
        this.elements = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void add(T item) {
        elements.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
