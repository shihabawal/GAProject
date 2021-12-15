import ga.controller.GAController;
import ga.controller.RandomGAController;
import ga.controller.StandardGAController;

public class App {

    public static void main(String[] args) throws Exception {

        GAController controller = new RandomGAController();
        controller.initalize();
        controller.run();
        controller = new StandardGAController(); /* dynamically set the strategy */
        controller.initalize();
        controller.run();
    }

}
