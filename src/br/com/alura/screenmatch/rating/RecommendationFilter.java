package br.com.alura.screenmatch.rating;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("It's among the best!");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Very highly rated at the moment!");
        } else {
            System.out.println("Put it on your list to watch later!");
        }
    }
}
