package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        FilmItem first = new FilmItem(1, "Film 1");
        FilmItem second = new FilmItem(2, "Film 2");
        FilmItem third = new FilmItem(3, "Film 3");
        FilmItem forth = new FilmItem(4, "Film 4");
        FilmItem fifth = new FilmItem(3, "Film 3");
        FilmManager manager = new FilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.filmsGet();

    }
}
