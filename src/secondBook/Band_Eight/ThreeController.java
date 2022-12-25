/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Eight;

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
public class ThreeController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView nine;
    @FXML
    private ImageView eight;
    @FXML
    private ImageView seven;
    @FXML
    private ImageView six;
    @FXML
    private ImageView five;
    @FXML
    private ImageView four;
    @FXML
    private ImageView three;
    @FXML
    private ImageView two;
    @FXML
    private ImageView one;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       draggablemaker.makeDraggable(one);
        draggablemaker.makeDraggable(two);
        draggablemaker.makeDraggable(three);
        draggablemaker.makeDraggable(four);
        draggablemaker.makeDraggable(five);
        draggablemaker.makeDraggable(six);
        draggablemaker.makeDraggable(seven);
        draggablemaker.makeDraggable(eight);
        draggablemaker.makeDraggable(nine);
    }    

    @FXML
    private void True(ActionEvent event) {
        draggablemaker.trueAction("/secondBook/Band_Eight/Four.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Eight/Four.fxml", event);
    }
    
}
