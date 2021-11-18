import java.util.Random;

public class Mutation {
    public Individual mutate(Individual individual) {
        return new Individual();
    }

    Population population = new Population();
    Individual fittest;
    Individual secondFittest;

    void mutation() {
        Random rn = new Random();

        //Select a random mutation point
        int mutationPoint = rn.nextInt(population.individuals[0].geneLength);

        //Flip values at the mutation point
        if (fittest.genes[mutationPoint] == 0) {
            fittest.genes[mutationPoint] = 1;
        } else {
            fittest.genes[mutationPoint] = 0;
        }

        mutationPoint = rn.nextInt(population.individuals[0].geneLength);

        if (secondFittest.genes[mutationPoint] == 0) {
            secondFittest.genes[mutationPoint] = 1;
        } else {
            secondFittest.genes[mutationPoint] = 0;
        }
    }
}
