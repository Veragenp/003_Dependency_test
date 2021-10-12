package ru.netology.domain;

import ru.netology.domain.FilmItem;

public class FilmManager {
    private int amountOffFilmGet = 5;
    private FilmItem[] items = new FilmItem[0];
        public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }

    public FilmManager(int amountOffFilmGet) {
        this.amountOffFilmGet = amountOffFilmGet;
    }

    public FilmManager() {
    }

    public FilmItem[] getItems() {
        return items;
    }

    public FilmItem[] filmsGet() {
            FilmItem[]  items = getItems();
            FilmItem[] result = new FilmItem[amountOffFilmGet];
            for (int i = 0; i < amountOffFilmGet; i++){
                int index = amountOffFilmGet - i - 1;
                result[i] = items[index];
            }
            return result;


    }

}
