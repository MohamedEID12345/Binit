/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_One;

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
public class TwoController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView circle;
    @FXML
    private ImageView square;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(circle);
        draggablemaker.makeDraggable(square);
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondMo3lga();
         draggablemaker.trueAction("/secondBook/Band_One/Three.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_One/Three.fxml", event);
    }
    
}
