public class Main {

    public static void main(String[] args) {

        Controller ctrl = new Controller();

        ctrl.addButton(new Button("A", true));
        ctrl.addButton(new Button("B", false));
        ctrl.addButton(new Button("X", false));
        ctrl.addButton(new Button("Y", true));
        ctrl.addButton(new Button("Z", true));
    }
}
