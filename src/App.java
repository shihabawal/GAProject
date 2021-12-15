import ga.GAController;
import ga.StandardGAController;
import ga.population.Population;

/*
TODO: develop more selection methods like fitness based selection
*/
public class App {
    private static final String Individual = null;

    public static void main(String[] args) throws Exception {

        GAController controller = new StandardGAController();
        controller.initalize();
        controller.run();
    }

}
