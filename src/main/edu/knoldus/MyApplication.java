package main.edu.knoldus;


import main.edu.knoldus.models.Genre;
import main.edu.knoldus.models.Movie;
import main.edu.knoldus.services.MovieUtilities;
import main.edu.knoldus.services.Operations;

import java.util.*;


public class MyApplication {



  public static void main(String[] args) {
    // write your code here

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      list.add(i);
    }

    Movie[] movieArray = {new Movie("barfi",2003,9, Genre.Comedy),new Movie("bareli",2003,9,Genre.Romance),new Movie("Golmaal",2004,7,Genre.Comedy),new Movie("interstellar",2015,6,Genre.SciFi)};
    List<Movie> movies = new ArrayList<>(Arrays.asList(movieArray));
    System.out.println("List with Prime Numbers " + Operations.getPrimeNumbers(list));
    System.out.println("word count map for file " + Operations.wordCountFromFile("src/main/resources/sampleText") );
    System.out.println("word count map for statement " + Operations.wordCount("sample Text is a sample file with some sample text ") );
    System.out.println( Operations.multiplyLists(list,list) );
    System.out.println("Comedy Movies with Rating Above 8 " + MovieUtilities.getMoviesWithHighRating(8,Genre.Comedy,movies));
    System.out.println("Movies released after 2002 with Rating below 8 " + MovieUtilities.getMoviesAfterYearWithLowRating(8,2002,movies));
    System.out.println("Movies with Even Rating " + MovieUtilities.getMoviesWithEvenRating(movies));
    System.out.println("SciFi Movies with Rating below 7 " + MovieUtilities.getMoviesWithLowRating(7,Genre.SciFi,movies));


  }
}
