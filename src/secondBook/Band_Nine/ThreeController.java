/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Nine;

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
    private RadioButton dargteen;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton darga;
    @FXML
    private RadioButton zero;
    @FXML
    private ImageView circle2;
    @FXML
    private ImageView triangle3;
    @FXML
    private ImageView triangle1;
    @FXML
    private ImageView triangle2;
    @FXML
    private ImageView square;
    @FXML
    private ImageView mosta2;
    @FXML
    private ImageView mosta1;
    @FXML
    private ImageView circle1;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(circle1);
        draggablemaker.makeDraggable(circle2);
        draggablemaker.makeDraggable(square);
        draggablemaker.makeDraggable(triangle1);
        draggablemaker.makeDraggable(triangle2);
        draggablemaker.makeDraggable(triangle3);
        draggablemaker.makeDraggable(mosta1);
        draggablemaker.makeDraggable(mosta2);
    }    

    @FXML
    private void Dargteen(ActionEvent event) {
         draggablemaker.trueAction("/secondBook/Band_Ten/One.fxml", event);
    }

    @FXML
    private void Darga(ActionEvent event) {
        draggablemaker.trueAction("/secondBook/Band_Ten/One.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Ten/One.fxml", event);
    }
    
}
