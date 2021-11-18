public class Selection {
    public Couple doSelection(Population population) {
        return new Couple();
    }

    Population population = new Population();
    Individual fittest;
    Individual secondFittest;

    void selection() {

        // Select the most fittest individual
        fittest = population.getFittest();

        // Select the second most fittest individual
        secondFittest = population.getSecondFittest();
    }
}
