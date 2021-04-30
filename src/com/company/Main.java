package com.company;

import com.company.Obejcts.Client;
import com.company.Obejcts.Genre;
import com.company.Obejcts.Movie;
import com.company.Obejcts.Ticket;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        Movie dieHard = new Movie("La jungla de cristal", LocalDate.of(1998,12,15),Genre.accion,
                "EE UU","Bruce Willis salva el dia",5, "+13",134);
        Movie antMan = new Movie("La hormiga humana", LocalDate.of(2015,7,16),Genre.accion
                ,"EE.UU","Un hombre se hace chiquito para salvar el dia", 6,"+13",115);
        Movie mulan= new Movie("Mulan",LocalDate.of(1998,6,15),Genre.aventura,"EE.UU"
                ,"Una chica se viste de hombre para salvar el dia", 6,"ATP",88);
        movies.add(mulan);
        movies.add(dieHard);
        movies.add(antMan);
        for (Movie movieAux:movies){
            System.out.println(movieAux.toString());
        }
        Client carlos= new Client("Carlos","2235656138","Avenida siempre viva");
        System.out.println(carlos.toString());
        carlos.RentMovie(movies,"Mulan");
        carlos.ShowTicket();
        Client pedro= new Client("pedro", "2235623024", "Privet Drive N4");
        pedro.RentMovie(movies, "la hormiga humana");
        pedro.RentMovie(movies,"la hormiga humana");
        clients.add(carlos);
        clients.add(pedro);
        System.out.println(mulan.getRentTimes());
        MostPopular(movies);
    }

    public static void ReturnToday(List<Client> clients){

       List<Ticket>tickets= clients.
               stream().
               map(Client::getTickets).
               flatMap(Collection::stream).
               filter(ticket -> ticket.getReturnDay().equals(LocalDate.now())).
               distinct().
               collect(Collectors.toList());

       for (Ticket t:tickets){
           System.out.println(t.toString());
       }
    }

    public static void MostPopular(List<Movie> movies){
        movies.sort(Comparator.comparing(Movie::getRentTimes).reversed());
        movies.forEach(System.out::println);
    }
}
