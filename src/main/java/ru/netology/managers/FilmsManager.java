package ru.netology.managers;

public class FilmsManager {
    private String[] films = new String[0];
    private int filmsLimit;

    public FilmsManager() {
        this.filmsLimit = 5;
    }

    public FilmsManager(int filmsLimit) {
        this.filmsLimit = filmsLimit;
    }


    public void add(String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < filmsLimit) {
            resultLength = films.length;
        } else {
            resultLength = filmsLimit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 -i];
        }
        return tmp;
    }
}
