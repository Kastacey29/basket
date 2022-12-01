package com.sky.pro.basket.service;

import com.sky.pro.basket.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addToBasket(List<Integer> ids) {
        this.basket.addToBasket(ids);
    }

    public List<Integer> getIds() {
        return this.basket.getIds();
    }
}
