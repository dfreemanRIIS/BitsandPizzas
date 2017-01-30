package com.example.dfreeman.bitsandpizzas;

/**
 * Created by dfreeman
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    //Defaults
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
