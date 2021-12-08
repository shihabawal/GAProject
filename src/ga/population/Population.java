package ga.population;

import java.util.ArrayList;

public class Population {

    private static Population instance;

    private static int size = 10;

    public static Population getInstance() {
        if (instance == null) {
            instance = new Population(size);
        }
        return instance;
    }

    ArrayList<Individual> individuals;

    // Define and intialize population
    private Population(int size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Individual newIndividual = new Individual();
            individuals.add(newIndividual);
        }
    }

    public int size() {
        return size;
    }

    public Individual getIndividual(int i) {
        return individuals.get(i); // individual[i]
    }

    public ArrayList<Individual> getIndividuals() {
        return individuals;
    }

    public int getPopulationCount() {
        return individuals.size();
    }

    public double getPopulationFitness() {
        int totalFitness = 0;
        for (Individual i : individuals) {
            totalFitness += i.getFitness();
        }
        return totalFitness;
    }

    @Override
    public String toString() {
        String toPrint = "";
        for (Individual i : individuals) {
            toPrint += i.toString() + "\n";
        }
        return toPrint;
    }

}
