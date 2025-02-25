package br.com.alura.screenmatch.calculator;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int fullTime = 0;

    public int getFullTime() {
        return fullTime;
    }

    public void includes(Title title) {
        System.out.println("Adding duration in minutes of " + title);
        this.fullTime += title.getDuration();
    }
}
