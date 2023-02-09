/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Twoenty;

import ThirdBook.Code;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import report.DegreeCount;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ThreeController implements Initializable {
DraggableMaker draggablemaker = new DraggableMaker();
    @FXML
    private RadioButton darga;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton zero;
    @FXML
    private RadioButton darga1;
    @FXML
    private ToggleGroup band1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdZakera6();
        Code code=new Code();
        code.back();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        draggablemaker.trueAction("/report/Report.fxml", event);
        //draggablemaker.trueAction("/firstBook/FirstBook.fxml", event);
        code.backrules20("/ThirdBook/Band_Sixteen/One.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
         ((Node)(event.getSource())).getScene().getWindow().hide();
        draggablemaker.falseAction("/report/Report.fxml", event);
        Code code=new Code();
        code.backrules20("/ThirdBook/Band_Sixteen/One.fxml", event);
    }

    @FXML
    private void Dargateen(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdZakera6();
        score.thirdZakera6();
        Code code=new Code();
        code.back();
        code.back();
 ((Node)(event.getSource())).getScene().getWindow().hide();
        draggablemaker.trueAction("/report/Report.fxml", event);
        code.backrules20("/ThirdBook/Band_Sixteen/One.fxml", event);
    }
    
}
