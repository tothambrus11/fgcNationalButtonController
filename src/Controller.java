import java.util.ArrayList;

public class Controller {

    private ArrayList<Button> buttons;

    /**
     * Controller's Constructor
     */
    Controller(){
        buttons = new ArrayList<>();
    }

    /**
     * Add button
     * @param newButton
     */
    public void addButton(Button newButton){
        buttons.add(newButton);
    }

    /**
     * Press all buttons
     */
    public void pressAll(){
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setState(true);

        }
    }

    /**
     * Release all buttons
     */
    public void releaseAll(){
        for (int i = 0; i <  buttons.size(); i++) {
            buttons.get(i).setState(false);
        }
    }

    /**
     * Returns the count of pressed buttons
     * @return
     */
    public int getNumOfPressedBtns() {
        int count = 0;

        for (int i = 0; i < buttons.size(); i++) {
            Button currentButton = buttons.get(i);
            if(currentButton.getState()){
                count++;
            }
        }

        return count;
    }

    /**
     * Prints the number of pressed buttons
     */
    public void printNumOfButtons(){
        System.out.println("Number of pressed buttons:" + this.getNumOfPressedBtns());
    }
}
