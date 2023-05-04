package com.example.homework_estore;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final Bucket bucket;

    public StoreService(Bucket bucket) {
        this.bucket = bucket;
    }
    public void add(List<Integer> items) {
        bucket.add(items);
    }
    public List<Integer> get() {
        return bucket.get();
    }
}
