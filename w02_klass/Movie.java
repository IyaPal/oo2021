import java.util.jar.Attributes.Name;

public class Movie {
    Genre genre;
    float durationMin;
    String name;

    public Movie(String name, Genre genre, float durationMin){
        this.name = name;
        this.genre = genre;
        this.durationMin = durationMin;
    }    

    public String getName() {
        return name;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
