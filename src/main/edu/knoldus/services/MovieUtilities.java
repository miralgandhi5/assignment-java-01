package main.edu.knoldus.services;

import main.edu.knoldus.models.Genre;
import main.edu.knoldus.models.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieUtilities {

  public static List<Movie> getMoviesWithHighRating(Integer rating , Genre genre, List<Movie> movies) {
    return movies.stream().filter(movie -> (movie.getRating() > rating) && (movie.getGenre().name().equals(genre.name()))).collect(Collectors.toList());
  }
  public static List<Movie> getMoviesAfterYearWithLowRating(Integer rating ,Integer releaseYear,List<Movie> movies) {
    return movies.stream().filter(movie -> (movie.getRating() < rating) && (movie.getReleaseYear() > releaseYear)).collect(Collectors.toList());
  }

  public static List<Movie> getMoviesWithEvenRating(List<Movie> movies) {
    return movies.stream().filter(movie -> movie.getRating() % 2 == 0).collect(Collectors.toList());
  }

  public static List<Movie> getMoviesWithLowRating(Integer rating ,Genre genre,List<Movie> movies) {
    return movies.stream().filter(movie -> (movie.getRating() <= rating) && (movie.getGenre().name().equals(genre.name()))).collect(Collectors.toList());
  }

}
