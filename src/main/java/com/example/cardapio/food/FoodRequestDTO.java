package com.example.cardapio.food;

public record FoodRequestDTO(String title, String image, Integer price) {
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }
}
