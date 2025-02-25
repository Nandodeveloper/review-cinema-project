import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.rating.RecommendationFilter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Movie goodFather = new Movie();
        goodFather.setName("The GoodFather");
        goodFather.setDirector("Francis Ford");
        goodFather.setDuration(180);
        goodFather.setReleaseYear(1972);
        goodFather.rate(8.5);
        goodFather.getClassification();

        Movie avatar = new Movie();
        avatar.setName("Avatar");
        avatar.setReleaseYear(2009);
        avatar.setDirector("James Cameron");
        avatar.setDuration(162);
        avatar.rate(8);
        avatar.getClassification();

        Movie joker = new Movie();
        joker.setName("Joker");
        joker.setReleaseYear(2019);
        joker.setDirector("Todd Phillips");
        joker.setDuration(122);
        joker.rate(9);
        joker.getClassification();

        Series dexter = new Series();
        dexter.setName("Dexter");
        dexter.setReleaseYear(1972);
        dexter.setMinutesPerEp(54);
        dexter.setSeasons(8);
        dexter.setEpPerSeason(12);
        dexter.setActive(false);
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

        Episode ep = new Episode();
        ep.setNumber(1);
        ep.setSeries(dexter);
        ep.setTotalViews(300);
        //filter.filter(ep);

        ArrayList<Movie> movieArray = new ArrayList<>();
        movieArray.add(goodFather);
        movieArray.add(avatar);
        movieArray.add(joker);
//        System.out.println(movieArray.size());
//        System.out.println(movieArray.get(0).getName());
        for (int i = 0; i < movieArray.size(); i++) {
            System.out.println("Movie: " + movieArray.get(i).getName()
                    + " (" + movieArray.get(i).getReleaseYear() + ")");
        }
        System.out.println(movieArray.toString());
    }
}