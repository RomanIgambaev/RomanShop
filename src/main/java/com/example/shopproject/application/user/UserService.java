package com.example.shopproject.application.user;

import com.example.shopproject.domain.entity.User;
import com.example.shopproject.presentation.exception.EntityNotFoundException;
import com.example.shopproject.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));    }

    public User create(User userFromCommand) {
        return repository.save(userFromCommand);
    }

    public User update(Long id, User userFromCommand) {
        User user = getById(id);

        if (!user.getName().equals(userFromCommand.getName())) {
            user.setName(userFromCommand.getName());
        }

        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
