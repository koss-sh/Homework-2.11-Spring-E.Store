package com.example.homework_estore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@Scope("Session scope")
public class Bucket {
    private List<Integer> bucket = new ArrayList<>();

    public void add(List<Integer> items) {
        bucket.addAll(items);
    }
    public List<Integer> get() {
        return bucket;
    }

}
