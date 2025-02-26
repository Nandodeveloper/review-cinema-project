package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.rating.Classifiable;

public class Episode implements Classifiable {
    private String name;
    private int number;
    private Series series;
    private int totalViews;

    public Episode(String name, Series series, int number) {
        this.setName(name);
        this.setSeries(series);
        this.setNumber(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification(){
        if(totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
