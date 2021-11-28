import java.util.Random;

public class Mutation {
    public Individual oneRandomCodonMutation(Individual individual) {
        Random r = new Random();
        char codon;

        int newRandom = r.nextInt(4);
        if (newRandom == 0) {
            codon = 'a';
        } else if (newRandom == 1) {
            codon = 'c';
        } else if (newRandom == 2) {
            codon = 't';
        } else {
            codon = 'g';
        }

        individual.setCodon(codon, r.nextInt(individual.getGeneLength()));
        return individual;
    }

    // Population population = new Population();
    // Individual fittest;
    // Individual secondFittest;

    // void mutation() {
    // Random rn = new Random();

    // // Select a random mutation point
    // int mutationPoint = rn.nextInt(population.individuals[0].geneLength);

    // // Flip values at the mutation point
    // if (fittest.genes[mutationPoint] == 0) {
    // fittest.genes[mutationPoint] = 1;
    // } else {
    // fittest.genes[mutationPoint] = 0;
    // }

    // mutationPoint = rn.nextInt(population.individuals[0].geneLength);

    // if (secondFittest.genes[mutationPoint] == 0) {
    // secondFittest.genes[mutationPoint] = 1;
    // } else {
    // secondFittest.genes[mutationPoint] = 0;
    // }
    // }
}
