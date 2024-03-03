package com.example.shopproject.presentation.product.dto.commands;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Data
public class CreateProductCommand {
    @Length(message = "Название от 3 до 50 символов", min = 3, max = 50)
    public String name;
    @Positive(message = "Цена не может быть отрицательной")
    public double price;

    public Long categoryId;
}
