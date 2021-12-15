package ga.population;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

public class Population {

    private static Population instance;

    private static int size = 10;

    /**
     * @param size we set size = 10;
     * @return Population
     */
    public static Population getInstance() { /* Using singleton pattern to initialize Population class */
        if (instance == null) { /* lazy initialize */
            instance = new Population(size);
        }
        return instance;
    }

    ArrayList<Individual> individuals;
    int totalFitness;

    /* Define and intialize population */
    private Population(int size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Individual newIndividual = new Individual();
            individuals.add(newIndividual);
        }
        totalFitness = 0;
    }

    public int calculatePopulationFitness(Individual target) {
        int sum = 0;
        for (Individual individual : individuals) {
            sum += individual.calculateFitness(target);
        }
        return sum;
    }

    /**
     * @return int
     */
    public int size() {
        return size;
    }

    /**
     * @param i index of the array
     * @return Individual
     */
    public Individual getIndividual(int i) {
        return individuals.get(i); /* individual[i] */
    }

    public void addIndividual(Individual individual) {
        individuals.add(individual);
        size++;
    }

    /**
     * @return ArrayList<Individual>
     */
    public ArrayList<Individual> getIndividuals() {
        return individuals;
    }

    /**
     * @return int
     */
    public int getPopulationCount() {
        return individuals.size();
    }

    public int getPopulationFitness() {
        return totalFitness;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        String toPrint = "";
        for (Individual i : individuals) {
            toPrint += i.toString() + "\n";
        }
        return toPrint;
    }

}
