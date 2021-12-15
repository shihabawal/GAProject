package ga.population;

import java.util.ArrayList;

public class Population {

    private static Population instance;

    private static int size = 10;

    /**
     * Returns a threadsafe Singleton instance
     * 
     * @return Population
     */
    public static synchronized Population getInstance() { /*
                                                           * Using thread safe singleton pattern to initialize
                                                           * Population class
                                                           */
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

    /**
     * the target DNA pattern we set 
     * 
     * @param target
     * @return int
     */
    public int calculatePopulationFitness(Individual target) {
        totalFitness = 0;
        for (Individual individual : individuals) {
            totalFitness += individual.calculateFitness(target);
        }
        return totalFitness;
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
     * @param individual
     */
    public void replaceLeastFittest(Individual individual) {
        int minFitness = Integer.MAX_VALUE;
        int minFitnessIndex = 0;
        for (int i = 0; i < size; i++) {
            if (individuals.get(i).getFitness() < minFitness) {
                minFitness = individuals.get(i).getFitness();
                minFitnessIndex = i;
            }
        }
        individuals.set(minFitnessIndex, individuals.get(minFitnessIndex));
    }

    /**
     * @param individual
     */
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

    /**
     * @return int
     */
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
