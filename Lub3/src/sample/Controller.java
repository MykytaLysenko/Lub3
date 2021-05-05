package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.css.Counter;

public class Controller {
    public Button btnMain;
    public TextField txtMain;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent) {
        if(clickCounter >=0){
            txtMain.setText("Klikow: " + ++clickCounter);
        }
        if (clickCounter == 1) {
            btnMain.setText("Wiecej");
        }
        if (clickCounter == 2) {
            btnMain.setText("Wiecej-wiecej");
        }
    }
}