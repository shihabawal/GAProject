public class StandardOperatorFactory implements OperatorFactory {

    @Override
    public Selection getSelection() {
        return new RouletteWheelSelection();
    }

    @Override
    public XOver getXover() {
        return new MidPointXOver();
    }

    @Override
    public Mutation getMustation() {
        return new SingleCodonMutation();
    }

}
