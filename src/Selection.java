import java.util.Random;

public class Selection {
    public Individual[] rouletteWheelSelection(Population population) {
        Individual couple[] = { null, null };
        Random rn = new Random();
        couple[0] = population.getIndividual(rn.nextInt(population.getPopulationCount()));
        couple[1] = population.getIndividual(rn.nextInt(population.getPopulationCount()));

        return couple;
    }

    // Population population = new Population();
    // Individual fittest;
    // Individual secondFittest;

    // void selection() {

    // // Select the most fittest individual
    // fittest = population.getFittest();

    // // Select the second most fittest individual
    // secondFittest = population.getSecondFittest();
    // }
}
