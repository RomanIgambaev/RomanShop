package com.example.shopproject.presentation.cart.dto.commands;

import com.example.shopproject.domain.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class CreateCartCommand {
    @NotBlank(message = "Имя пользователя не должно быть пустым")
    private String userName;
    private List<Long> productIds;
}
