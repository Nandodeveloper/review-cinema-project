package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.rating.Classifiable;

public class Serie extends Title implements Classifiable {
    private int seasons;
    private int epPerSeason;
    private boolean active;
    private int minutesPerEp;

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
}
