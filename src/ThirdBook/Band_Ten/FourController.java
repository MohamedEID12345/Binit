/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Ten;

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
public class FourController implements Initializable {
DraggableMaker draggablemaker = new DraggableMaker();
    @FXML
    private RadioButton darga;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton zero;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalKamy4();
        Code code=new Code();
        code.back();
        draggablemaker.trueAction("/ThirdBook/Band_Ten/Five.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/ThirdBook/Band_Ten/Five.fxml", event);
    }
    
}
