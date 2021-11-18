/*
TODO1: Finish the code i.e. feed children back to population
TODO2: develop fitness algorithm to calculate fitness of 1 individual
TODO3: develop more selection methods like fitness based selection
TODO4: think about abstract factory pattern for selection
*/
public class App {
    private static final String Individual = null;

    public static void main(String[] args) throws Exception {
        // Population population = new Population();

        // Selection randomSelection = new Selection();
        // Couple couple1 = randomSelection.doSelection(population);

        // Xover onePoint = new Xover();
        // Individual ofspring = onePoint.doXover(couple1);

        // Mutation mutation = new Mutation();
        // ofspring = mutation.mutate(ofspring);

        // Fitness filter = new Fitness();
        // population.add(ofspring);

        Population population = new Population(10);
        Selection selector = new Selection();
        Individual[] couple = { null, null };
        System.out.println();
        couple = selector.rouletteWheelSelection(population);
        System.out.println(couple[0]);
        System.out.println(couple[1]);
        System.out.println();
        Xover xover = new Xover();
        Individual[] children = { null, null };
        children = xover.halfXover(couple);
        System.out.println(children[0]);
        System.out.println(children[1]);
        Mutation mutate = new Mutation();
        children[1] = mutate.oneRandomCodonMutation(children[1]);
        System.out.println(children[1]);

        // Individual fittest;
        // Individual secondFittest;

        // Individual getFittestOffspring() {
        // if (fittest.fitness > secondFittest.fitness) {
        // return fittest;
        // }
        // return secondFittest;
        // }

        // void addFittestOffspring() {

        // //Update fitness values of offspring
        // fittest.calcFitness();
        // secondFittest.calcFitness();

        // //Get index of least fit individual
        // int leastFittestIndex = population.getLeastFittestIndex();

        // //Replace least fittest individual from most fittest offspring
        // population.individuals[leastFittestIndex] = getFittestOffspring();
        // }
    }

}
