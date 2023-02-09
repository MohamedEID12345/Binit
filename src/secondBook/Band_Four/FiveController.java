/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Four;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import report.DegreeCount;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class FiveController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView one;
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
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondEstdla2();
        draggablemaker.trueAction("/secondBook/Band_Four/Six.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Four/Six.fxml", event);
    }
    
}
