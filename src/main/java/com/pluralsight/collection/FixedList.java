package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public <T> void add(T item){}
    public List<T> getItems(){
        return items;
    }
}
