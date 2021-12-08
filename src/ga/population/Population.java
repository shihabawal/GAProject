package ga.population;

import java.util.ArrayList;

public class Population {

    ArrayList<Individual> individuals;

    // Define and intialize population
    public Population(int size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Individual newIndividual = new Individual();
            individuals.add(newIndividual);
        }
    }

    public int size() {
        return 0;
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
