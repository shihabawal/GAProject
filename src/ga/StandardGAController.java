package ga;

import ga.population.Individual;
import ga.population.Population;

public class StandardGAController extends GAController {

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
        do {
            Population population = new Population(10);
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
        } while (generation < maxGenerations && (!children[0].isTarget() ||
                !children[1].isTarget()));
        System.out.println(generation);

    }

}
