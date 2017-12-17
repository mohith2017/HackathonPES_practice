package com.example.mohith.helloworld;

/**
 * Created by K.S.LOHITH on 17-12-2017.
 */

public class stadium {
    private String name_of_stadium;
    private String location;
    private int cost;
    private String weather;
    private int image_id;

   public stadium(String name_of_stadium,String location,int cost,String weather,int image_id)
    {
        this.name_of_stadium = name_of_stadium;
        this.location = location;
        this.cost = cost;
        this.weather = weather;
        //Developed
        this.image_id = image_id;
    }

    public String getName_of_stadium() {
        return name_of_stadium;
    }

    public String getLocation() {
        return location;
    }

    public int getCost() {
        return cost;
    }

    public String getWeather() {
        return weather;
    }
    public int getImage_id() {
        return image_id;
    }
}
