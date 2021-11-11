import java.util.ArrayList;

public class Population {
    ArrayList<Individual> population;

    Population() {
        population = new ArrayList<Individual>();
    }

    public void add(Individual individual) {
        population.add(individual);
    }
}
