interface Movie
{
    void  watchMovie(String movie_name, String genre, String language, String director, String producer, String release_date);
}
interface Movie2
{
    void  watchAnotherMovie(String movie_name, String genre, String language, String director, String producer, String release_date);


}
interface Calculator {
    int add(int a, int b);
}
public class LambaExpression implements Movie2, Movie{
    @Override
    public void watchAnotherMovie(String movie_name, String genre, String language, String director, String producer, String release_date) {
        System.out.println("Movie: " + movie_name + " (" + language + ")\nGenre: " + genre +"\nDirected by: " + director + "\nProduced by: " + producer + "\nRelease date: " + release_date);
    }

    @Override
    public void watchMovie(String movie_name, String genre, String language, String director, String producer, String release_date) {
        System.out.println("Movie: " + movie_name + " (" + language + ")\nGenre: " + genre +"\nDirected by: " + director + "\nProduced by: " + producer + "\nRelease date: " + release_date);
    }



    public static void main(String[] args) {

        Movie2 movie = new LambaExpression();
        Movie movie2 = new LambaExpression();
        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(10, 20));
        movie2.watchMovie("Avengers Doomsday", "Action", "English", "Anthony Russo and Joe Russo", "Kevin Feige", "2026-12-18");
        movie.watchAnotherMovie("The Matrix", "Sci-Fi", "English", "Lana Wachowski and Lilly Wachowski", "Joel Silver", "1999-03-31");

    }
}

