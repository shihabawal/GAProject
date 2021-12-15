import ga.GAController;
import ga.RandomGAController;
import ga.StandardGAController;

public class App {
    private static final String Individual = null;

    public static void main(String[] args) throws Exception {

        GAController controller = new RandomGAController();
        controller.initalize();
        controller.run();
    }

}
