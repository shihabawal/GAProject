package ga.factory;

import ga.mutataion.Mutation;
import ga.selection.Selection;
import ga.xover.XOver;

public interface OperatorFactory {
    public Selection getSelection();

    public XOver getXover();

    public Mutation getMutation();
}
