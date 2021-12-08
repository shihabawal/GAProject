package ga.xover;

import ga.population.Individual;

public interface XOver {
    public Individual[] doXOver(Individual[] couple);
}
