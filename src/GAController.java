public abstract class GAController {
    OperatorFactory operatorFactory;

    Selection selector;
    XOver xOver;
    Mutation mutator;

    abstract void run();
}
