import java.util.Random;

public class Selection {
    public Individual[] rouletteWheelSelection(Population population) {
        Individual couple[] = { null, null };
        Random rn = new Random();
        couple[0] = population.getIndividual(rn.nextInt(population.getPopulationCount()));
        couple[1] = population.getIndividual(rn.nextInt(population.getPopulationCount()));

        return couple;
    }

    public Individual selectParent(Population population) {
        // Get individuals
        Individual individuals[] = population.getIndividual();
        // Spin roulette wheel
        double populationFitness = population.getPopulationFitness();
        double rouletteWheelPosition = Math.random() * populationFitness;
        // Find parent
        double spinWheel = 0;
        for (Individual individual : individuals) {
            spinWheel += Fitness.getFitness(individual);
            if (spinWheel >= rouletteWheelPosition) {
                    return individual;
            }
        }
        return individuals[population.size() - 1];
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
