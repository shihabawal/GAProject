/*
TODO1: Finish the code i.e. feed children back to population
TODO2: develop fitness algorithm to calculate fitness of 1 individual
TODO3: develop more selection methods like fitness based selection
TODO4: think about abstract factory pattern for selection
*/
public class App {
    private static final String Individual = null;

    public static void main(String[] args) throws Exception {

        // Population population = new Population(10);
        // RandomSelection selector = new RandomSelection();
        // Individual[] couple = { null, null };
        // System.out.println();
        // couple = selector.randomSelection(population);
        // System.out.println(couple[0]);
        // System.out.println(couple[1]);
        // System.out.println();
        // Xover xover = new Xover();
        // Individual[] children = { null, null };
        // children = xover.halfXover(couple);
        // System.out.println(children[0]);
        // System.out.println(children[1]);
        // SingleCodonMutation mutate = new SingleCodonMutation();
        // children[1] = mutate.oneRandomCodonMutation(children[1]);
        // System.out.println(children[1]);
        GAController controller = new StandardGAController();
        controller.run();

    }

}
