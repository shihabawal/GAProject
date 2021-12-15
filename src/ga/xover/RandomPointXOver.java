package ga.xover;

import java.util.ArrayList;
import java.util.List;

import ga.population.Individual;
import ga.population.Gene;

public class RandomPointXOver implements XOver {

    @Override
    public Individual[] doXOver(Individual[] couple) {
        Individual children[] = { null, null };

        List<Gene<Character>> gene1 = couple[0].getGenes();
        List<Gene<Character>> gene2 = couple[1].getGenes();

        List<Gene<Character>> child1Gene = new ArrayList<>();
        List<Gene<Character>> child2Gene = new ArrayList<>();

        int randomPoint = (int) (Math.random() * gene1.size());

        for (int i = 0; i < gene1.size(); i++) {
            if (i <= randomPoint) {
                child1Gene.add(gene1.get(i));
                child2Gene.add(gene2.get(i));
            } else {
                child1Gene.add(gene2.get(i));
                child2Gene.add(gene1.get(i));
            }
        }
        children[0] = new Individual(child1Gene);
        children[1] = new Individual(child2Gene);
        return children;
    }
}
