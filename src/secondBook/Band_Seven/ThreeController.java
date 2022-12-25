/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Seven;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ThreeController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private RadioButton true11;
    @FXML
    private ToggleGroup band1;
    @FXML
    private RadioButton false11;
    @FXML
    private RadioButton true111;
    @FXML
    private ToggleGroup band11;
    @FXML
    private RadioButton false111;
    @FXML
    private RadioButton true1111;
    @FXML
    private ToggleGroup band111;
    @FXML
    private RadioButton false1111;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True3(ActionEvent event) {
    }

    @FXML
    private void False3(ActionEvent event) {
    }

    @FXML
    private void True1(ActionEvent event) {
    }

    @FXML
    private void False1(ActionEvent event) {
    }

    @FXML
    private void True2(ActionEvent event) {
    }

    @FXML
    private void False2(ActionEvent event) {
    }

    @FXML
    private void True4(ActionEvent event) {
        draggablemaker.trueAction("/secondBook/Band_Eight/One.fxml", event);
    }

    @FXML
    private void False4(ActionEvent event) {
        draggablemaker.trueAction("/secondBook/Band_Eight/One.fxml", event);
    }
    
}
