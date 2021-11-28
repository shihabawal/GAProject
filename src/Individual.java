import java.util.Random;
import java.util.Arrays;

public class Individual {
    int fitness;
    char[] genes;
    private final int geneLength = 20;

    // initailize an individual and their genes
    public Individual() {
        genes = new char[geneLength];
        Random rn = new Random();

        // Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            int newRandom = rn.nextInt(4);
            if (newRandom == 0) {
                genes[i] = 'a';
            } else if (newRandom == 1) {
                genes[i] = 'c';
            } else if (newRandom == 2) {
                genes[i] = 't';
            } else if (newRandom == 3) {
                genes[i] = 'g';
            }
            // genes[i] = Math.abs(rn.nextInt() % 2);
        }
        fitness = 0;
    }

    public Individual(char[] genes) {
        this.genes = new char[geneLength];
        this.genes = genes;
        fitness = 0;
    }

    public char[] getGenes() {
        return genes;
    }

    public void setGenes(char[] newGenes) {
        genes = newGenes;
    }

    public char getCodon(int i) {
        return genes[i];
    }

    public void setCodon(char codon, int i) {
        genes[i] = codon;
    }

    public int getGeneLength() {
        return geneLength;
    }

    @Override
    public String toString() {
        return Arrays.toString(genes) + " fitness: " + fitness;
    }
}
