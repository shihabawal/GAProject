public class StandardGAController extends GAController {

    void run() {
        selector = new RandomSelection();
        xOver = new MidPointXOver();
        mutator = new SingleCodonMutation();

        Population population = new Population(10);
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
