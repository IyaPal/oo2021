public class Main {

    public static void main(String[] args) {
        Movie psycho = new Movie("Psycho", Genre.HORROR, 120);
        Movie tenet = new Movie("Tenet", Genre.SCIFI, 150);
        Movie rm = new Movie("Rick & Morty", Genre.COMEDY, 45);
        Movie bac = new Movie("Bachelor", Genre.ROMANCE, 90);

        System.out.println(rm.getName());
        bac.setGenre(Genre.COMEDY);
        System.out.println(bac.genre);
    }

}
