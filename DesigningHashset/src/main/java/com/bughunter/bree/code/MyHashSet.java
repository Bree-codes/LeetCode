package com.bughunter.bree.code;

import java.util.LinkedList;

class MyHashSet {
    private static final int BUCKET_COUNT = 1000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[BUCKET_COUNT];
        for (int i = 0; i < BUCKET_COUNT; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(int key) {
        return key % BUCKET_COUNT;
    }

    public void add(int key) {
        int index = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove((Integer) key);
    }

    public boolean contains(int key) {
        int index = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
}
