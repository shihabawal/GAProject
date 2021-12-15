package ga.population;

public class Gene<T> {
    private T gene;

    public Gene(T aGene) {
        gene = aGene;
    }

    /**
     * @return T
     */
    public T getGene() {
        return gene;
    }

    /**
     * @param aGene set aGene=gene
     */
    public void setGene(T aGene) {
        gene = aGene;
    }

    /**
     * @return String
     */
    public String toString() {
        return gene.toString();
    }
}
