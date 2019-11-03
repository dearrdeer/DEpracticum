package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("You've clicked me!");
        label.setText("Hello world!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
