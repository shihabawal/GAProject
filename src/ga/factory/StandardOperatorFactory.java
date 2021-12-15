package ga.factory;

import ga.mutataion.Mutation;
import ga.mutataion.SingleCodonMutation;
import ga.selection.RandomSelection;
import ga.selection.Selection;
import ga.xover.MidPointXOver;
import ga.xover.XOver;

public class StandardOperatorFactory implements OperatorFactory { /* Using abstract factory pattern */

    @Override
    public Selection getSelection() {
        return new RandomSelection();
    }

    @Override
    public XOver getXover() {
        return new MidPointXOver();
    }

    @Override
    public Mutation getMutation() {
        return new SingleCodonMutation();
    }

}
