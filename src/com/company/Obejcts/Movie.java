package com.company.Obejcts;

import java.time.LocalDate;

public class Movie {
    private final String title;
    private final LocalDate releaseDate;
    private final String genre;
    private final String country;
    private final String description;
    private  int stock;
    private final String pegi;
    private final int duration;
    private int rentTimes;

    public Movie(String title, LocalDate releaseDate, String genre, String country, String description, int stock, String pegi, int duration) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.country = country;
        this.description = description;
        this.stock = stock;
        this.pegi = pegi;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Pelicula: "+ this.title +"\nAño de lanzamiento: " + releaseDate + "\nGenero: " + genre +
                "\nPais de origen: " + country + "\nDescripcion: " +description + "\nClasificacion: "+pegi + "\nDuracion: " +duration;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) { this.stock = stock; }

    public int getRentTimes() { return rentTimes; }

    public void setRentTimes(int rentTimes) {
        this.rentTimes = rentTimes;
    }

    public String getTitle() {
        return title;
    }

}




