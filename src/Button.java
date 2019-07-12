public class Button {

    private String ID;
    private boolean pressed;

    public Button(String ID, boolean pressed) {
        this.ID = ID;
        this.pressed = pressed;
    }

    public String getID() {
        return ID;
    }

    public void setState(boolean newState){
        this.pressed = newState;
    }

    public boolean getState(){
        return pressed;
    }
}
