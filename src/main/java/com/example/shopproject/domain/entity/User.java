package com.example.shopproject.domain.entity;

import com.example.shopproject.domain.vakueobj.BaseClass;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseClass {

    private String name;

}
