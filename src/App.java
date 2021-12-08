import ga.GAController;
import ga.StandardGAController;
import ga.population.Population;

/*
TODO: Finish the code i.e. feed children back to population
TODO: develop more selection methods like fitness based selection
TODO: Check if Strategy pattern is appropriate for Fitness
*/
public class App {
    private static final String Individual = null;

    public static void main(String[] args) throws Exception {

        GAController controller = new StandardGAController();
        controller.initalize();
        controller.run();
        Population.getInstance();
    }

}
