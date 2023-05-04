package com.example.homework_estore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/order/add")
    public void add(@RequestParam ("ID")List<Integer> items) {
        storeService.add(items);
    }
    @GetMapping("/order/get")
    public List<Integer> get() {
        return storeService.get();
    }
}
