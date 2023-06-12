package ru.netology.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void testIfEmpty() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {  };

        Assertions.assertArrayEquals(expected, actual );
    }

    @Test
    public void testIfAdd1() {
        FilmsManager manager = new FilmsManager();

        manager.add("Бладшот");

        String[] actual = manager.findAll();
        String[] expected = { "Бладшот" };

        Assertions.assertArrayEquals(expected, actual );
    }


    @Test
    public void testIfAdd7() {
        FilmsManager manager = new FilmsManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findAll();
        String[] expected = { "Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один" };

        Assertions.assertArrayEquals(expected, actual );
    }

    @Test
    public void testFindLastIfOver5() {
        FilmsManager manager = new FilmsManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastIf5() {
        FilmsManager manager = new FilmsManager();

        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastIfUnder5() {
        FilmsManager manager = new FilmsManager();

        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastIfEmpty() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {  };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastParameterizedIfOverLimit() {
        FilmsManager manager = new FilmsManager(3);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastParameterizedIfLimit() {
        FilmsManager manager = new FilmsManager(3);

        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastParameterizedIfUnderLimit() {
        FilmsManager manager = new FilmsManager(3);

        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = { "Номер один", "Тролли. Мировой тур" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastParameterizedIfEmpty() {
        FilmsManager manager = new FilmsManager(3);

        String[] actual = manager.findLast();
        String[] expected = {  };

        Assertions.assertArrayEquals(expected, actual);
    }

}
