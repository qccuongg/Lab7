/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class CD implements Serializable {

    private String id;
    private String collection;
    private String type;
    private String title;
    private int price;
    private int releaseYear;

    public CD(String id, String collection, String type, String title, int price, int releaseYear) {
        this.id = id;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public String getCollection() {
        return collection;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
