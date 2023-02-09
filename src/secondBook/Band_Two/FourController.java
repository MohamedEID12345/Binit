/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Two;

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
public class FourController implements Initializable {

    @FXML
    private ImageView car;
    @FXML
    private ImageView cup3;
    @FXML
    private ImageView cup1;
    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView cup2;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(cup1);
        draggablemaker.makeDraggable(cup2);
        draggablemaker.makeDraggable(cup3);
        draggablemaker.makeDraggable(car);
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondZakera();
        draggablemaker.trueAction("/secondBook/Band_Three/One.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Three/One.fxml", event);
    }
    
}
