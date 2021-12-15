package ga.factory;

import ga.mutataion.Mutation;
import ga.mutataion.RandomCodonMutation;
import ga.selection.RandomSelection;
import ga.selection.Selection;
import ga.xover.RandomPointXOver;
import ga.xover.XOver;

public class RandomOperatorFactory implements OperatorFactory {
    /**
     * Returns selection according to the factory type
     * 
     * @return Selection
     */
    /* Using abstract factory pattern */

    @Override
    public Selection getSelection() {
        return new RandomSelection();
    }

    /**
     * Returns crossover according to factory type
     * 
     * @return XOver
     */
    @Override
    public XOver getXover() {
        return new RandomPointXOver();
    }

    /**
     * Returns mutation according to factory type
     * 
     * @return Mutation
     */
    @Override
    public Mutation getMutation() {
        return new RandomCodonMutation();
    }

}
