package ru.skypro.shopping.cart.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.shopping.cart.service.StoreService;

import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void add(Set<Integer> goods) {
        shoppingCart.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
