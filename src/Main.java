import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.rating.RecommendationFilter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Movie goodFather = new Movie("The GoodFather", "Francis Ford",
                180, 1972);
        goodFather.rate(8.5);
        goodFather.getClassification();

        Movie avatar = new Movie("Avatar", "James Cameron",
                162, 2009);
        avatar.rate(8);
        avatar.getClassification();

        Movie joker = new Movie("Joker", "Todd Phillips",
                122, 2019);
        joker.rate(9);
        joker.getClassification();

        Series dexter = new Series("Dexter", 1972, 8);
        dexter.getDuration();
        dexter.rate(8.5);
        dexter.getClassification();

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(goodFather);
        timeCalculator.includes(avatar);
        timeCalculator.includes(dexter);
        timeCalculator.includes(joker);
        //System.out.println(timeCalculator.getFullTime());

        RecommendationFilter filter = new RecommendationFilter();
//        filter.filter(goodFather);
//        filter.filter(avatar);
//        filter.filter(dexter);
//        filter.filter(joker);

        Episode ep = new Episode("Dexter", dexter, 1);
        ep.setTotalViews(300);
        //filter.filter(ep);

        ArrayList<Movie> movieArray = new ArrayList<>();
        movieArray.add(goodFather);
        movieArray.add(avatar);
        movieArray.add(joker);
        System.out.println(movieArray.size());
        for (int i = 0; i < movieArray.size(); i++) {
            System.out.println( i + "." + " Movie: " + movieArray.get(i).getName()
                    + " (" + movieArray.get(i).getReleaseYear() + ")");
        }
        for(Title title : movieArray) {
                System.out.println("Movie: " + title.getName()
                        + " (" + title.getReleaseYear() + ")");
        }
        System.out.println(movieArray.toString());
    }
}