import java.util.Random;

public class SingleCodonMutation implements Mutation {
    @Override
    public Individual mutate(Individual individual) {
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
}
