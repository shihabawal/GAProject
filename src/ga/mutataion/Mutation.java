package ga.mutataion;

import ga.population.Individual;

public interface Mutation {
    public Individual mutate(Individual individual);
}
