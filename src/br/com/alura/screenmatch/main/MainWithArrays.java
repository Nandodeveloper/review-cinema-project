package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainWithArrays {
    public static void main(String[] args) {
        ArrayList<Title> movieArray = new ArrayList<>();

        Movie goodFather = new Movie("The GoodFather", 1972);
        Movie avatar = new Movie("Avatar", 2009);
        Movie joker = new Movie("Joker", 2019);
        Series dexter = new Series("Dexter", 1972);
        movieArray.add(goodFather);
        movieArray.add(avatar);
        movieArray.add(joker);
        movieArray.add(dexter);

        Collections.sort(movieArray);
        for(Title title : movieArray) {
            System.out.println("Title: " + title.getName()
                    + " (" + title.getReleaseYear() + ")");
        }
        movieArray.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Comparing by year of release");
        System.out.println(movieArray);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(2);
        ints.add(1);
        ints.add(3);
        Collections.sort(ints);
        System.out.println(ints);
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        list.add("e 1");
        list.add("e 2");
        list1.add("e 1");
        list1.add("e 2");
        System.out.println(list);
        System.out.println(list1);
        List<String> listap;
        listap = new LinkedList<>();
        listap.add("oi1");
        listap.add("oi2");
        System.out.println("Linked List: " + listap);
        listap = new ArrayList<>();
        listap.add("alo1");
        listap.add("alo2");
        System.out.println("ArrayList: " + listap);
    }
}
