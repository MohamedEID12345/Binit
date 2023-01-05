/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Ten;

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
public class TwoController implements Initializable {
DraggableMaker draggablemaker = new DraggableMaker();
    @FXML
    private RadioButton darga;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton zero;
    @FXML
    private ImageView twocolumn1;
    @FXML
    private ImageView twocolumn2;
    @FXML
    private ImageView fourcolumn1;
    @FXML
    private ImageView fourcolumn2;
    @FXML
    private ImageView twocolumn4;
    @FXML
    private ImageView twocolumn3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(twocolumn1);
        draggablemaker.makeDraggable(twocolumn2);
        draggablemaker.makeDraggable(twocolumn3);
        draggablemaker.makeDraggable(twocolumn4);
        draggablemaker.makeDraggable(fourcolumn1);
        draggablemaker.makeDraggable(fourcolumn2);
    }    

    @FXML
    private void Darga(ActionEvent event) {
        draggablemaker.trueAction("/ThirdBook/Band_Ten/Three.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/ThirdBook/Band_Ten/Three.fxml", event);
    }
    
}
