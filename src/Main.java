import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.rating.RecommendationFilter;


public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("The GoodFather");
        movie1.setDirector("Francis Ford");
        movie1.setDuration(180);
        movie1.setReleaseYear(1972);
        movie1.setIncludedInPlan(true);
        movie1.rate(8.0);
        movie1.rate(7.0);
        movie1.rate(5.0);
        movie1.rate(9.0);
        movie1.getClassification();
        //movie1.displayTitle();

        Movie movie2 = new Movie();
        movie2.setDuration(150);

        Series dexter = new Series();
        dexter.setName("Dexter");
        dexter.setReleaseYear(1972);
        dexter.setIncludedInPlan(true);
        dexter.setMinutesPerEp(54);
        dexter.setSeasons(8);
        dexter.setEpPerSeason(12);
        dexter.setActive(false);
        dexter.rate(8.0);
        dexter.rate(7.0);
        dexter.rate(5.0);
        dexter.rate(9.0);
        dexter.displayTitle();
        System.out.println("Duration to marathon dexter: "+dexter.getDuration()+" min");

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(movie1);
        timeCalculator.includes(movie2);
        timeCalculator.includes(dexter);
        System.out.println(timeCalculator.getFullTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie1);
        filter.filter(movie2);
        filter.filter(dexter);

        Episode ep = new Episode();
        ep.setNumber(1);
        ep.setSeries(dexter);
        ep.setTotalViews(300);
        filter.filter(ep);
    }
}