package com.example.shopproject.application.cart;

import com.example.shopproject.domain.entity.Cart;
import com.example.shopproject.presentation.exception.EntityNotFoundException;
import com.example.shopproject.infrastructure.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository repository;

    public List<Cart> getAll() {
        return repository.findAll();
    }

    public Cart getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cart with id " + id + " not found"));    }

    public Cart create(Cart cartFromCommand)
    {
        return repository.save(cartFromCommand);
    }

    public Cart update(Long id, Cart cartFromCommand) {
        Cart cart = getById(id);


        return repository.save(cart);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
