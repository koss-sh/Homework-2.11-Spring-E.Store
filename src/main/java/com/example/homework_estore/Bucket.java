package com.example.homework_estore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
@SessionScope
public class Bucket {
    private List<Integer> bucket = new ArrayList<>();

    public void add(List<Integer> items) {
        bucket.addAll(items);
    }
    public List<Integer> get() {
        return bucket;
    }
}
