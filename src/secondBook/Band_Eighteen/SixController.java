/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Eighteen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class SixController implements Initializable {

    @FXML
    private ImageView square1;
    @FXML
    private ImageView square2;
    @FXML
    private ImageView square3;
    @FXML
    private ImageView square4;
    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView square5;
    @FXML
    private ImageView square6;
    @FXML
    private ImageView square7;
    @FXML
    private ImageView square8;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(square1);
        draggablemaker.makeDraggable(square2);
        draggablemaker.makeDraggable(square3);
        draggablemaker.makeDraggable(square4);
        draggablemaker.makeDraggable(square5);
        draggablemaker.makeDraggable(square6);
        draggablemaker.makeDraggable(square7);
        draggablemaker.makeDraggable(square8);
    }    

    @FXML
    private void True(ActionEvent event) {
        draggablemaker.trueAction("/secondBook/Band_Nineteen/One.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Nineteen/One.fxml", event);
    }
    
}
