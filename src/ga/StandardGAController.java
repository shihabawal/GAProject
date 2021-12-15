package ga;

import java.util.ArrayList;

import ga.population.Gene;
import ga.population.Individual;
import ga.population.Population;

public class StandardGAController extends GAController { /* Using abstract factory pattern */

    @Override
    public void initalize() {
        operatorFactory = new StandardOperatorFactory();
        super.initalize();
    }

    public void run() {
        int maxGenerations = 1000;
        int generation = 0;
        Individual[] couple = { null, null };
        Individual[] children = { null, null };
        ArrayList<Gene<Character>> targetGene = new ArrayList<>();
        targetGene.add(new Gene<Character>('a'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('c'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        targetGene.add(new Gene<Character>('x'));
        Individual target = new Individual(targetGene);
        Population population = Population.getInstance();
        System.out.println(population.calculatePopulationFitness(target));

        System.out.println(population);
        System.out.println("target: " + target);
        do {
            // System.out.println(population);
            // System.out.println();
            couple = selector.select(population);
            // System.out.println("Parent1: " + couple[0]);
            // System.out.println("Parent2: " + couple[1]);
            // System.out.println();
            children = xOver.doXOver(couple);
            // System.out.println("Child1: " + children[0]);
            // System.out.println("Child2: " + children[1]);
            // System.out.println();
            children[0] = mutator.mutate(children[0]);
            children[1] = mutator.mutate(children[1]);
            // System.out.println("Before: " + children[0]);
            // System.out.println("After : " + children[0]);
            // System.out.println();
            // TODO: Replacement
            generation++;
        } while (generation < maxGenerations && (!children[0].isTarget(target) ||
                !children[1].isTarget(target)));
        System.out.println(generation);

    }

}
