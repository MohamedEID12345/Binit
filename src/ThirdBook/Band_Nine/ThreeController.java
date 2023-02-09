/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Nine;

import ThirdBook.Code;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private RadioButton dargteen;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton darga;
    @FXML
    private RadioButton zero;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Dargteen(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili4();
        score.thirdEstdlalTahlili4();
        Code code=new Code();
        code.back();
        code.back();
        draggablemaker.trueAction("/ThirdBook/Band_Ten/One.fxml", event);
        code.backrules9("/ThirdBook/Band_Five/One.fxml", event);
    }

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili4();
        Code code=new Code();
        code.back();
        draggablemaker.trueAction("/ThirdBook/Band_Ten/One.fxml", event);
        code.backrules9("/ThirdBook/Band_Five/One.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/ThirdBook/Band_Ten/One.fxml", event);
        Code code=new Code();
        code.backrules9("/ThirdBook/Band_Five/One.fxml", event);
    }
    
}
