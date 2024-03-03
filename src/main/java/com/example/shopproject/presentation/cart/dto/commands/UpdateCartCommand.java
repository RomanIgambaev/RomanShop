package com.example.shopproject.presentation.cart.dto.commands;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class UpdateCartCommand {
    @NotBlank(message = "Имя пользователя не должно быть пустым")
    private String userName;
    private List<Long> productIds;
}
