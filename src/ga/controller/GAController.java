package ga.controller;

import ga.factory.OperatorFactory;
import ga.mutataion.Mutation;
import ga.selection.Selection;
import ga.xover.XOver;

public abstract class GAController { /* Using abstract factory pattern */
    OperatorFactory operatorFactory;

    Selection selector;
    XOver xOver;
    Mutation mutator;

    public void initalize() {
        selector = operatorFactory.getSelection();
        xOver = operatorFactory.getXover();
        mutator = operatorFactory.getMutation();
    }

    public abstract void run();
}
