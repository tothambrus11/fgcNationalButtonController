import java.util.ArrayList;

public class Controller {

    private ArrayList<Button> buttons;

    Controller(){
        buttons = new ArrayList<>();
    }

    public void addButton(Button newButton){
        buttons.add(newButton);
    }

    public void pressAll(){
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setState(true);

        }
    }
    public void releaseAll(){
        for (int i = 0; i <  buttons.size(); i++) {
            buttons.get(i).setState(false);
        }
    }

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
}
