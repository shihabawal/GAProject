package ga.population;

public class Gene<T> {
    private T gene;

    public Gene(T aGene) {
        gene = aGene;
    }

    public T getGene() {
        return gene;
    }

    public void setGene(T aGene) {
        gene = aGene;
    }

    public String toString() {
        return gene.toString();
    }
}
