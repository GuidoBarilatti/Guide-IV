package com.company.Obejcts;

import java.time.LocalDate;

public class Ticket {
    private Client client;
    private Movie movie;
    private LocalDate day= LocalDate.now();
    private LocalDate returnDay= LocalDate.now().plusDays(2);
    private double total;

    public Ticket() {
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getReturnDay() {
        return returnDay;
    }

    @Override
    public String toString() {
        return "Cliente: " + client.getName() + "\nPelicula: " + movie.getTitle() + "\nFecha de retiro: " + day
                + "\nFecha de devolucion: " +returnDay;
    }
}
