package com.company.Obejcts;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;
    private String cel;
    private String address;
    static private List<Ticket> tickets= new ArrayList<>();

    public Client(String name, String cel, String address) {
        this.name = name;
        this.cel = cel;
        this.address = address;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {

        return "Cliente: " + name + "\nCelular: " + cel + "\nDireccion: " + address;
    }

    public String getName() {
        return name;
    }

    public void RentMovie(ArrayList<Movie> movies, String title){
        Ticket ticket=new Ticket();
        Movie movie = movies.stream().filter(m -> m.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
        if(movie != null){
            ticket.setClient(Client.this);
            ticket.setMovie(movie);
            this.tickets.add(ticket);
            movie.setRentTimes(movie.getRentTimes()+1);
        }
        else {
            System.out.println("La pelicula no se encuentra en stock");
        }
    }

    public void ShowTicket(){
        if(!tickets.isEmpty()){
            for (Ticket ticket: tickets){
                System.out.println(ticket.toString());
            }
        }
        else {
            System.out.println("El cliente no tiene tickets");
        }
    }
}
