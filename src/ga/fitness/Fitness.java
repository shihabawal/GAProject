package ga.fitness;

import ga.population.Individual;

import java.util.ArrayList;

public class Fitness {
    // public Individual filter(Individual individual) {
    // return new Individual();
    // }

    static ArrayList<Character> solution = new ArrayList<Character>();

    public static void setSolution(ArrayList<Character> newSolution) {
        solution = newSolution;
    }

    static void setSolution(String newSolution) {
        solution = new ArrayList<Character>(newSolution.length());
        for (int i = 0; i < newSolution.length(); i++) {
            String character = newSolution.substring(i, i + 1);
            if (character.contains("A") || character.contains("G")) {
                setSolution("T");
            } else {
                setSolution("C");
            }
        }
    }

    // Calculate inidividuals fittness by comparing it to our candidate solution
    public static int getFitness(Individual individual) {
        int fitness = 0;
        // Loop through our individuals genes and compare them to our cadidates
        for (int i = 0; i < individual.getGeneLength() && i < solution.size(); i++) {
            if (individual.getCodon(i) == solution.get(i)) {
                fitness++;
            }
        }
        return fitness;
    }

    // Get optimum fitness
    static int getMaxFitness() {
        int maxFitness = solution.size();
        return maxFitness;
    }
}
