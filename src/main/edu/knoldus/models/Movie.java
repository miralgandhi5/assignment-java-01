package main.edu.knoldus.models;

public class Movie {
  String name;
  Integer releaseYear  = 2000;//Release year (2000 till 2018)
  Integer rating = 0 ;//(upto 10)
  Genre genre ;//(Romance, Comedy, Sci-Fi, Suspense, Scary)

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  private void setReleaseYear(Integer releaseYear) {
    if(releaseYear >= 2000 && releaseYear <= 2018) {
      this.releaseYear = releaseYear;
    }else{
      throw new IllegalArgumentException("release year sould be between 2000 to 2018");
    }
  }

  public Integer getRating() {
    return rating;
  }

  private void setRating(Integer rating) {
    if(rating >= 0 && rating <= 10) {
      this.rating = rating;
    }else{
      throw new IllegalArgumentException("range sould be less than equal to 10");
    }
  }

  public Genre getGenre() {
    return genre;
  }

  private void setGenre(Genre genre) {
    this.genre = genre;
  }

  public Movie(String name, Integer releaseYear, Integer rating, Genre genre) {
    this.setName(name);
    this.setReleaseYear(releaseYear);
    this.setRating(rating);
    this.setGenre(genre);
  }

  @Override
  public String toString() {
    return "Movie{" +
        "name='" + name + '\'' +
        ", releaseYear=" + releaseYear +
        ", rating=" + rating +
        ", genre=" + genre +
        '}';
  }
}
