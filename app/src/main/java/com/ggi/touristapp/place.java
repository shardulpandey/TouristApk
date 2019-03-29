package com.ggi.touristapp;

public class place {

    private int image_Data;
    private String name;
    private String description;

    public place(int image,String nameOfPlace,String descriptionOfPlace){
        image_Data = image;
        name = nameOfPlace;
        description = descriptionOfPlace;
    }

    public int getImage_Data() {
        return image_Data;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage_Data(int image_Data) {
        this.image_Data = image_Data;
    }

    public void setName(String name) {
        this.name = name;
    }
}
