import java.util.Random;

public class Xover {
    public Individual doXover(Couple couple) {
        return new Individual();
    }

    Population population = new Population();
    Individual fittest;
    Individual secondFittest;

    void crossover() {
        Random rn = new Random();

        //Select a random crossover point
        int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);

        //Swap values among parents
        for (int i = 0; i < crossOverPoint; i++) {
            int temp = fittest.genes[i];
            fittest.genes[i] = secondFittest.genes[i];
            secondFittest.genes[i] = temp;

        }

    }
}
