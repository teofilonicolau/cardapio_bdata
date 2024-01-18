package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;


    public Food(String title, String image, Integer price){
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public Food(FoodRequestDTO data) {
        this.title = data.getTitle();
        this.image = data.getImage();
        this.price = data.getPrice();
    }
}
