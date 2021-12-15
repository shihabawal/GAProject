package ga.mutataion;

import ga.population.Individual;

import java.util.Random;

public class RandomCodonMutation implements Mutation {

    /**
     * @param individual
     * @return Individual
     */
    @Override
    public Individual mutate(Individual individual) {
        Random r = new Random();
        char codon;
        int newRandom = r.nextInt(4);
        int randomTimes = r.nextInt(individual.getGeneLength());
        for (int i = 0; i < randomTimes; i++) {
            char[] sequence = { 'a', 'c', 't', 'g' };
            codon = sequence[newRandom];
            if (r.nextDouble() >= 0.5) {
                individual.setCodon(codon, r.nextInt(individual.getGeneLength()));
            }
        }
        return individual;
    }
}
