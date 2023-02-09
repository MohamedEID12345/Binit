/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_TwoentyOne;

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
public class OneController extends DegreeCount implements Initializable {

    @FXML
    private RadioButton dargteen;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton darga;
    @FXML
    private RadioButton zero;
    @FXML
    private ImageView mosta2;
    @FXML
    private ImageView moain;
    @FXML
    private ImageView triangle1;
    @FXML
    private ImageView square;
    @FXML
    private ImageView triangle2;
    @FXML
    private ImageView nos1;
    @FXML
    private ImageView nos2;
    @FXML
    private ImageView circle;
    @FXML
    private ImageView triangle3;
    @FXML
    private ImageView mosta1;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(square);
        draggablemaker.makeDraggable(mosta1);
        draggablemaker.makeDraggable(mosta2);
        draggablemaker.makeDraggable(moain);
        draggablemaker.makeDraggable(nos1);
        draggablemaker.makeDraggable(nos2);
        draggablemaker.makeDraggable(circle);
        draggablemaker.makeDraggable(triangle1);
        draggablemaker.makeDraggable(triangle2);
        draggablemaker.makeDraggable(triangle3);
        w=0;
    }    

    @FXML
    private void Dargteen(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondMo3lga6();
        score.secondMo3lga6();
        score.reseetFirstOneVal();
        score.firstOneVal();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_TwoentyOne/Two.fxml", event);
    }

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondMo3lga6();
        score.reseetFirstOneVal();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_TwoentyOne/Two.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_TwoentyOne/Two.fxml", event);
    }
    
}
