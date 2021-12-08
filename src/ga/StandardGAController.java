package ga;
//TODO: Max generations e.g. 1000

//TODO: target

import ga.population.Individual;
import ga.population.Population;

public class StandardGAController extends GAController {

    @Override
    public void initalize() {
        operatorFactory = new StandardOperatorFactory();
        super.initalize();
    }

    public void run() {

        Population population = Population.getInstance();
        System.out.println(population);
        System.out.println();
        Individual[] couple = selector.select(population);
        System.out.println("Parent1: " + couple[0]);
        System.out.println("Parent2: " + couple[1]);
        System.out.println();
        Individual[] children = xOver.doXOver(couple);
        System.out.println("Child1: " + children[0]);
        System.out.println("Child2: " + children[1]);
        System.out.println();
        children[0] = mutator.mutate(children[0]);
        System.out.println("Before: " + children[0]);
        System.out.println("After : " + children[0]);
        System.out.println();

    }

}
