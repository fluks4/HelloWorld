package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label hw;

    public void Start(ActionEvent actionEvent) {
        hw.setText("Hello World!");
    }
}