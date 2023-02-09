/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ThirdBook.Band_Five;

import ThirdBook.Code;
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
public class OneController extends DegreeCount implements Initializable {
DraggableMaker draggablemaker = new DraggableMaker();
    @FXML
    private RadioButton darga;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton zero;
    @FXML
    private ImageView q1;
    @FXML
    private ImageView q33;
    @FXML
    private ImageView q32;
    @FXML
    private ImageView q31;
    @FXML
    private ImageView q30;
    @FXML
    private ImageView q29;
    @FXML
    private ImageView q28;
    @FXML
    private ImageView q27;
    @FXML
    private ImageView q26;
    @FXML
    private ImageView q25;
    @FXML
    private ImageView q24;
    @FXML
    private ImageView q23;
    @FXML
    private ImageView q22;
    @FXML
    private ImageView q21;
    @FXML
    private ImageView q11;
    @FXML
    private ImageView q12;
    @FXML
    private ImageView q13;
    @FXML
    private ImageView q14;
    @FXML
    private ImageView q15;
    @FXML
    private ImageView q16;
    @FXML
    private ImageView q17;
    @FXML
    private ImageView q18;
    @FXML
    private ImageView q19;
    @FXML
    private ImageView q20;
    @FXML
    private ImageView q10;
    @FXML
    private ImageView q9;
    @FXML
    private ImageView q8;
    @FXML
    private ImageView q7;
    @FXML
    private ImageView q6;
    @FXML
    private ImageView q5;
    @FXML
    private ImageView q4;
    @FXML
    private ImageView q3;
    @FXML
    private ImageView q2;
    @FXML
    private RadioButton darga1;
    @FXML
    private ToggleGroup band1;
    @FXML
    private RadioButton darga2;
    @FXML
    private ToggleGroup band2;
    @FXML
    private RadioButton darga21;
    @FXML
    private ToggleGroup band21;
    @FXML
    private RadioButton darga211;
    @FXML
    private ToggleGroup band211;
    @FXML
    private RadioButton darga2111;
    @FXML
    private ToggleGroup band2111;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(q1);
        draggablemaker.makeDraggable(q2);
        draggablemaker.makeDraggable(q3);
        draggablemaker.makeDraggable(q4);
        draggablemaker.makeDraggable(q5);
        draggablemaker.makeDraggable(q6);
        draggablemaker.makeDraggable(q7);
        draggablemaker.makeDraggable(q8);
        draggablemaker.makeDraggable(q9);
        draggablemaker.makeDraggable(q10);
        draggablemaker.makeDraggable(q11);
        draggablemaker.makeDraggable(q12);
        draggablemaker.makeDraggable(q13);
        draggablemaker.makeDraggable(q14);
        draggablemaker.makeDraggable(q15);
        draggablemaker.makeDraggable(q16);
        draggablemaker.makeDraggable(q17);
        draggablemaker.makeDraggable(q18);
        draggablemaker.makeDraggable(q19);
        draggablemaker.makeDraggable(q20);
        draggablemaker.makeDraggable(q21);
        draggablemaker.makeDraggable(q22);
        draggablemaker.makeDraggable(q23);
        draggablemaker.makeDraggable(q24);
        draggablemaker.makeDraggable(q25);
        draggablemaker.makeDraggable(q26);
        draggablemaker.makeDraggable(q27);
        draggablemaker.makeDraggable(q28);
        draggablemaker.makeDraggable(q29);
        draggablemaker.makeDraggable(q30);
        draggablemaker.makeDraggable(q31);
        draggablemaker.makeDraggable(q32);
        draggablemaker.makeDraggable(q33);
        te=0;
    }    

    @FXML
    private void Darga(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Zero(ActionEvent event) {
        draggablemaker.falseAction("/ThirdBook/Band_Six/One.fxml", event);
        Code code=new Code();
        code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Dargteen(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Three(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
        code.back();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Four(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
        code.back();
        code.back();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Five(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
        code.back();
        code.back();
        code.back();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }

    @FXML
    private void Six(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        score.thirdEstdlalTahlili3();
        Code code=new Code();
        code.back();
        code.back();
        code.back();
        code.back();
        code.back();
        code.back();
         draggablemaker.trueAction("/ThirdBook/Band_Six/One.fxml", event);
         code.backrules5("/ThirdBook/Band_One/One.fxml", event);
    }
    
}
