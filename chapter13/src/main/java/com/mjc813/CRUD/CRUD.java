package com.mjc813.CRUD;

public interface CRUD<TYPE> {
    void add(TYPE item);
    int size();
    TYPE set(int index, TYPE item);
    TYPE remove(int index);
    TYPE get(int index);
    String getJson(int index);
    String getJsonAllItems();
}
