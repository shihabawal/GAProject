package ga;

import ga.mutataion.Mutation;
import ga.mutataion.SingleCodonMutation;
import ga.selection.RouletteWheelSelection;
import ga.selection.Selection;
import ga.xover.MidPointXOver;
import ga.xover.XOver;

public class StandardOperatorFactory implements OperatorFactory { /* Using abstract factory pattern */

    @Override
    public Selection getSelection() {
        return new RouletteWheelSelection();
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
