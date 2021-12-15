package ga.selection;

import ga.population.Individual;
import ga.population.Population;

import java.util.Random;

public class RandomSelection implements Selection {

    /**
     * Randomly selecting two individuals from population
     * 
     * @param population The entire population of Individuals
     * @return Individual[] Array containing two individuals who will be considered
     *         a couple
     */
    @Override
    public Individual[] select(Population population) {
        Individual couple[] = { null, null };
        Random rn = new Random();
        couple[0] = population.getIndividual(rn.nextInt(population.getPopulationCount()));
        couple[1] = population.getIndividual(rn.nextInt(population.getPopulationCount()));

        return couple;
    }

}
