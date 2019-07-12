public class Button {

    private String ID;
    private boolean pressed;

    /**
     * Button constructor
     * @param ID
     * @param pressed
     */
    public Button(String ID, boolean pressed) {
        this.ID = ID;
        this.pressed = pressed;
    }

    /**
     * Get ID
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     * Set state
     * @param newState
     */
    public void setState(boolean newState){
        this.pressed = newState;
    }

    /**
     * Get state
     * @return
     */
    public boolean getState(){
        return pressed;
    }
}
