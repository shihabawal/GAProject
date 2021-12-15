package ga.population;

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

    /* Define and intialize population */
    private Population(int size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Individual newIndividual = new Individual();
            individuals.add(newIndividual);
        }
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

    /**
     * @return double
     */
    public double getPopulationFitness() {
        int totalFitness = 0;
        for (Individual i : individuals) {
            totalFitness += i.getFitness();
        }
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
