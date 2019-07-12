public class Main {

    public static void main(String[] args) {

        // Init controller
        Controller ctrl = new Controller();

        // Add buttons
        ctrl.addButton(new Button("A", true));
        ctrl.addButton(new Button("B", false));
        ctrl.addButton(new Button("X", false));
        ctrl.addButton(new Button("Y", true));
        ctrl.addButton(new Button("Z", true));

        ctrl.printNumOfButtons();

        ctrl.pressAll();
        ctrl.printNumOfButtons();

        ctrl.releaseAll();
        ctrl.printNumOfButtons();
    }
}
