public class Xover {
    public Individual[] halfXover(Individual[] couple) {
        Individual children[] = { null, null };

        String gene1 = new String(couple[0].getGenes());
        String gene2 = new String(couple[1].getGenes());

        String childGene1 = gene1.substring(0, (couple[0].getGeneLength() / 2))
                + gene2.substring((couple[0].getGeneLength() / 2), couple[0].getGeneLength());

        String childGene2 = gene2.substring(0, (couple[0].getGeneLength() / 2))
                + gene1.substring((couple[0].getGeneLength() / 2), couple[0].getGeneLength());

        children[0] = new Individual(childGene1.toCharArray());
        children[1] = new Individual(childGene2.toCharArray());

        return children;
    }

    // Population population = new Population();
    // Individual fittest;
    // Individual secondFittest;

    // void crossover() {
    // Random rn = new Random();

    // // Select a random crossover point
    // int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);

    // // Swap values among parents
    // for (int i = 0; i < crossOverPoint; i++) {
    // int temp = fittest.genes[i];
    // fittest.genes[i] = secondFittest.genes[i];
    // secondFittest.genes[i] = temp;

    // }

    // }
}
