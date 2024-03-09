package com.example.listviewdemo;

/**
 * @author Tian
 * @description
 * @date :2020/6/24 22:43
 */
public class Fruit {
    private String fruitName;
    private int fruitPictureId;

    public Fruit(String fruitName, int fruitPictureId) {
        this.fruitName = fruitName;
        this.fruitPictureId = fruitPictureId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitPictureId() {
        return fruitPictureId;
    }

    public void setFruitPictureId(int fruitPictureId) {
        this.fruitPictureId = fruitPictureId;
    }
}
