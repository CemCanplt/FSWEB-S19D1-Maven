package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
// ID değişkeni genelde Long olur. Eğer başka bir tür kullanıyorsan, bunu kendine göre değiştir.


    @Column(name = "name")
    @NotNull
    @Size(min = 2, max = 45, message = "İsim uzunluğu 2 ile 45 arasında olmalı.")
    private String name;

    @Column(name = "price")
    @DecimalMin("10")
    private Double price;


}
