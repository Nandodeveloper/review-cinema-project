package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.rating.Classifiable;

public class Series extends Title implements Classifiable {
    private int seasons;
    private int epPerSeason;
    private boolean active;
    private int minutesPerEp;

    public Series(String name, int releaseYear, int seasons, int epPerSeason,
                  int minutesPerEp, boolean active){
        this.setName(name);
        this.setReleaseYear(releaseYear);
        this.setSeasons(seasons);
        this.setEpPerSeason(epPerSeason);
        this.setMinutesPerEp(minutesPerEp);
        this.setActive(active);
    }

    public boolean isActive() {
        return active;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpPerSeason() {
        return epPerSeason;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpPerSeason(int epPerSeason) {
        this.epPerSeason = epPerSeason;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    @Override
    public int getDuration() {
        return seasons * epPerSeason * minutesPerEp;
    }
    @Override
    public int getClassification() {
        return (int) average() / 2;
    }
    @Override
    public String toString() {
        return "Series: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
