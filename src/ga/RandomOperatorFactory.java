package ga;

import ga.mutataion.Mutation;
import ga.mutataion.RandomCodonMutation;
import ga.selection.RandomSelection;
import ga.selection.Selection;
import ga.xover.RandomPointXOver;
import ga.xover.XOver;

public class RandomOperatorFactory implements OperatorFactory { /* Using abstract factory pattern */

    @Override
    public Selection getSelection() {
        return new RandomSelection();
    }

    @Override
    public XOver getXover() {
        return new RandomPointXOver();
    }

    @Override
    public Mutation getMutation() {
        return new RandomCodonMutation();
    }

}
