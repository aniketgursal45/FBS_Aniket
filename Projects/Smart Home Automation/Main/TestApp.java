package Main;
import Controller.HouseController;
import View.HouseView;

public class TestApp {
    public static void main(String[] args) {

        HouseController controller = new HouseController();
        HouseView view = new HouseView(controller);

        view.showOptions();   // start the menu
    }
}