package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfRatings;
    private int totalRatings = 0;
    private int duration;

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void rate(double rating) {
        sumOfRatings = sumOfRatings + rating;
        totalRatings++;
    }

    public double average() {
        return sumOfRatings / totalRatings;
    }

    public void displayTitle() {
        System.out.println("Technical sheet:");
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration+" min");
        System.out.println("Release year: " + releaseYear);
        System.out.println("Average rating: " + average());
        if (totalRatings == 0) {
            System.out.println("Total ratings: null");
        } else {
            System.out.println("Total ratings: " + totalRatings);
        }
    }
}
