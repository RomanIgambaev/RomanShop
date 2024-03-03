package com.example.shopproject.presentation.category.dto.commands;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateCategoryCommand {
    @NotBlank(message = "Название категории не должно быть пустым")
    public String name;
}
