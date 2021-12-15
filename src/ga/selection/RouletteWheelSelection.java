package ga.selection;

import ga.population.Individual;
import ga.population.Population;
// import ga.fitness.Fitness;

import java.util.ArrayList;
import java.util.Random;

public class RouletteWheelSelection implements Selection {

    /**
     * @param population population is a class that has multiple methods like
     *                   getIndividuals/getPopulationFitness.
     * 
     * @return Individual[]
     *         for example, Individual1 would be the first parent,
     *         Individual2 would be the second parent.
     */
    @Override
    public Individual[] select(Population population) {
        /* Get individuals */
        ArrayList<Individual> individuals = population.getIndividuals();
        /* Spin roulette wheel */
        double populationFitness = (double) population.getPopulationFitness();
        double rouletteWheelPosition = Math.random() * populationFitness;
        /* Find parent */
        double spinWheel = 0;
        Individual individual1 = new Individual();
        for (Individual individual : individuals) {
            spinWheel += individual.getFitness();
            if (spinWheel >= rouletteWheelPosition) {
                individual1 = individual;
                break;
                /* return individual */
            }
        }
        rouletteWheelPosition = Math.random() * populationFitness;
        spinWheel = 0;
        Individual individual2 = new Individual();
        for (Individual individual : individuals) {
            spinWheel += individual.getFitness();
            if (spinWheel >= rouletteWheelPosition) {
                individual2 = individual;
                break;
            }
        }
        /* return individuals[population.size() - 1]; */
        Individual[] ret = { individual1, individual2 };
        return ret;
    }

}
