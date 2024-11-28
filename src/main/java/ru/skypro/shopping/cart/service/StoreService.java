package ru.skypro.shopping.cart.service;

import java.util.Set;

public interface StoreService {

    void add(Set<Integer> goods);

    Set<Integer> get();
}
