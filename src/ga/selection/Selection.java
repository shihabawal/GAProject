package ga.selection;

import ga.population.Individual;
import ga.population.Population;

public interface Selection {
    public Individual[] select(Population population);
}
