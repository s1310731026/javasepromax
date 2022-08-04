package com.jasoncode.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("A",10,"Jason"));
        movies.add(new Movie("B",9,"Jason2"));
        movies.add(new Movie("C",2.1,"Jason3"));

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        movies.forEach((movie) -> System.out.println(movie.toString()));
    }
}
