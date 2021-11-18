import java.util.ArrayList;

public class Population {

    ArrayList<Individual> individuals;

    // Define and intialize population
    public Population(int size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new Individual());
        }
    }

    public Individual getIndividual(int i) {
        return individuals.get(i); // individual[i]
    }

    public int getPopulationCount() {
        return individuals.size();
    }

    // // Get the fittest individual
    // public Individual getFittest() {
    // int maxFit = Integer.MIN_VALUE;
    // int maxFitIndex = 0;
    // for (int i = 0; i < individuals.length; i++) {
    // if (maxFit <= individuals[i].fitness) {
    // maxFit = individuals[i].fitness;
    // maxFitIndex = i;
    // }
    // }
    // fittest = individuals[maxFitIndex].fitness;
    // return individuals[maxFitIndex];
    // }

    // // Get the second most fittest individual
    // public Individual getSecondFittest() {
    // int maxFit1 = 0;
    // int maxFit2 = 0;
    // for (int i = 0; i < individuals.length; i++) {
    // if (individuals[i].fitness > individuals[maxFit1].fitness) {
    // maxFit2 = maxFit1;
    // maxFit1 = i;
    // } else if (individuals[i].fitness > individuals[maxFit2].fitness) {
    // maxFit2 = i;
    // }
    // }
    // return individuals[maxFit2];
    // }

    // // Get index of least fittest individual
    // public int getLeastFittestIndex() {
    // int minFitVal = Integer.MAX_VALUE;
    // int minFitIndex = 0;
    // for (int i = 0; i < individuals.length; i++) {
    // if (minFitVal >= individuals[i].fitness) {
    // minFitVal = individuals[i].fitness;
    // minFitIndex = i;
    // }
    // }
    // return minFitIndex;
    // }

    // // Calculate fitness of each individual
    // public void calculateFitness() {

    // for (int i = 0; i < individuals.length; i++) {
    // individuals[i].calcFitness();
    // }
    // getFittest();
    // }
    @Override
    public String toString() {
        String toPrint = "";
        for (Individual i : individuals) {
            toPrint += i.toString() + "\n";
        }
        return toPrint;
    }
}
