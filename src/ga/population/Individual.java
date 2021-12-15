package ga.population;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Individual {
    int fitness;
    List<Gene<Character>> genes;
    private final int geneLength = 10;

    /* initailize an individual and their genes */
    public Individual() {
        fitness = 0;
        genes = new ArrayList<>();
        Random rn = new Random();

        /* Set genes randomly for each individual */
        for (int i = 0; i < geneLength; i++) {
            int newRandom = rn.nextInt(4);
            if (newRandom == 0) {
                /* genes[i] = 'a'; */
                genes.add(new Gene<Character>('a'));
            } else if (newRandom == 1) {
                /* genes[i] = 'c'; */
                genes.add(new Gene<Character>('c'));
            } else if (newRandom == 2) {
                /* genes[i] = 't'; */
                genes.add(new Gene<Character>('t'));
            } else if (newRandom == 3) {
                /* genes[i] = 'g'; */
                genes.add(new Gene<Character>('g'));
            }
            /* genes[i] = Math.abs(rn.nextInt() % 2); */
        }
    }

    public Individual(List<Gene<Character>> genes) {
        this.genes = genes;
        fitness = 0;
    }

    /**
     * @return List<Gene<Character>>
     */
    public List<Gene<Character>> getGenes() {
        return genes;
    }

    /**
     * @param newGenes
     */
    public void setGenes(List<Gene<Character>> newGenes) {
        genes = newGenes;
    }

    /**
     * @param i the index of char
     * @return char
     */
    public char getCodon(int i) {
        return genes.get(i).getGene();
    }

    /**
     * @param codon codon represents a single character in DNA like "a", "c", "t" or
     *              "g".
     * @param i
     */
    public void setCodon(char codon, int i) {
        genes.set(i, new Gene<Character>(codon));
    }

    /**
     * @return int
     */
    public int getGeneLength() {
        return geneLength;
    }

    /**
     * @return int
     */
    public int getFitness() {
        return fitness;
    }

    /**
     * @param fitness int fitness
     */
    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    /**
     * @param target
     * @return boolean
     */
    public boolean isTarget(Individual target) {
        for (int i = 0; i < geneLength; i++) {
            if (target.genes.get(i).getGene() == 'x') {
                continue;
            }
            if (target.genes.get(i).getGene() != this.genes.get(i).getGene()) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param target
     * @return int
     */
    public int calculateFitness(Individual target) {
        for (int i = 0; i < geneLength; i++) {
            if (target.genes.get(i).getGene() == this.genes.get(i).getGene()) {
                fitness++;
            }
        }
        return fitness;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return Arrays.toString(genes.toArray()) + " fitness: " + fitness;
    }

}
