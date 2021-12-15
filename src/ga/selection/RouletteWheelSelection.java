package ga.selection;

import ga.population.Individual;
import ga.population.Population;
import ga.fitness.Fitness;

import java.util.ArrayList;
import java.util.Random;

public class RouletteWheelSelection implements Selection {

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
            spinWheel += Fitness.getFitness(individual);
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
            spinWheel += Fitness.getFitness(individual);
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
