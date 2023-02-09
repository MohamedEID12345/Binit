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
import report.DegreeCount;
import secondBook.Code.DraggableMaker;
import secondBook.Code.Rules;

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
        DegreeCount score = new DegreeCount();
        score.secondMo3lga3();
        score.secondMo3lga3();
        score.firstOneVal();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        rules.back();
         draggablemaker.trueAction("/secondBook/Band_Ten/One.fxml", event);
         rules.backrules9("/secondBook/Band_Five/One.fxml",event);
    }

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondMo3lga3();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_Ten/One.fxml", event);
        rules.backrules9("/secondBook/Band_Five/One.fxml",event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Ten/One.fxml", event);
        Rules rules = new Rules();
         rules.backrules9("/secondBook/Band_Five/One.fxml",event);
    }
    
}
