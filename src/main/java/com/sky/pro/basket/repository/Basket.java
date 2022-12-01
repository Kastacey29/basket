package com.sky.pro.basket.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> ids = new ArrayList<>();

    public void addToBasket(List<Integer> ids) {
        this.ids.addAll(ids);
    }

    public List<Integer> getIds() {
        return this.ids;
    }
}
