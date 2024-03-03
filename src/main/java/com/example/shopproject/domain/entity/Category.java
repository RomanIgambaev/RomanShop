package com.example.shopproject.domain.entity;

import com.example.shopproject.domain.vakueobj.BaseClass;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseClass {

    private String name;

}
