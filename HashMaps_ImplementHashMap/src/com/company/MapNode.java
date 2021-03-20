package com.company;

public class MapNode<T,V> {
    T key;
    V value;
    MapNode<T,V> next;
    public MapNode(T key,V value) {
        this.key = key;
        this.value=value;
        this.next = null;
}}
