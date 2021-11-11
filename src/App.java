public class App {
    public static void main(String[] args) throws Exception {
        Population population = new Population();

        Selection randomSelection = new Selection();
        Couple couple1 = randomSelection.doSelection(population);

        Xover onePoint = new Xover();
        Individual ofspring = onePoint.doXover(couple1);

        Mutation mutation = new Mutation();
        ofspring = mutation.mutate(ofspring);

        Fitness filter = new Fitness();
        population.add(filter.filter(ofspring));
    }
}
