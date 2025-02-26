import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.rating.RecommendationFilter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        RecommendationFilter filter = new RecommendationFilter();
        ArrayList<Movie> movieArray = new ArrayList<>();


        Movie goodFather = new Movie("The GoodFather", 1972);
        goodFather.setDuration(175);
        goodFather.setDirector("Francis Ford");
        goodFather.rate(8.5);
        goodFather.getClassification();
        filter.filter(goodFather);
        movieArray.add(goodFather);

        Movie avatar = new Movie("Avatar", 2009);
        avatar.setDirector("James Cameron");
        avatar.setDuration(162);
        avatar.rate(8);
        avatar.getClassification();
        filter.filter(avatar);
        movieArray.add(avatar);

        Movie joker = new Movie("Joker", 2019);
        joker.setDuration(122);
        joker.setDirector("Todd Phillips");
        joker.rate(9);
        joker.getClassification();
        filter.filter(joker);
        movieArray.add(joker);

        Series dexter = new Series("Dexter", 1972);
        dexter.setActive(false);
        dexter.setSeasons(8);
        dexter.setEpPerSeason(12);
        dexter.setMinutesPerEp(54);
        dexter.getDuration();
        dexter.rate(8.5);
        dexter.getClassification();
        filter.filter(dexter);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(goodFather);
        timeCalculator.includes(avatar);
        timeCalculator.includes(dexter);
        timeCalculator.includes(joker);
        //System.out.println(timeCalculator.getFullTime());

        Episode ep = new Episode("Dexter", dexter, 1);
        ep.setTotalViews(300);
        filter.filter(ep);


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