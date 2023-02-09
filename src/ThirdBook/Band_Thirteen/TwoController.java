/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Thirteen;

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
public class TwoController implements Initializable {
DraggableMaker draggablemaker = new DraggableMaker();
    @FXML
    private RadioButton darga;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton zero;
    @FXML
    private RadioButton dargteen;
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
        score.thirdEstdlalTahlili5();
        Code code=new Code();
        code.back();
        draggablemaker.trueAction("/ThirdBook/Band_Thirteen/Three.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/ThirdBook/Band_Thirteen/Three.fxml", event);
    }

    @FXML
    private void Dargateen(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili5();
        score.thirdEstdlalTahlili5();
        Code code=new Code();
        code.back();
        code.back();
        draggablemaker.trueAction("/ThirdBook/Band_Thirteen/Three.fxml", event);
    }
    
}
