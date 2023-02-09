/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_TwoentyTwo;

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
public class SixController extends DegreeCount implements Initializable {

    @FXML
    private ImageView square1;
    @FXML
    private ImageView square2;
    @FXML
    private ImageView square3;
    @FXML
    private ImageView square4;
    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView square5;
    @FXML
    private ImageView square6;
    @FXML
    private ImageView square7;
    @FXML
    private ImageView square8;
    int total=0;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(square1);
        draggablemaker.makeDraggable(square2);
        draggablemaker.makeDraggable(square3);
        draggablemaker.makeDraggable(square4);
        draggablemaker.makeDraggable(square5);
        draggablemaker.makeDraggable(square6);
        draggablemaker.makeDraggable(square7);
        draggablemaker.makeDraggable(square8);
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondZakera6();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        total=a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x;
         if(total<=17){
        draggablemaker.trueAction("/ThirdBook/Band_One/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=27){
        draggablemaker.trueAction("/ThirdBook/Band_Five/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=47){
        draggablemaker.trueAction("/ThirdBook/Band_Nine/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=74){
         draggablemaker.trueAction("/ThirdBook/Band_Thirteen/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }else{
        draggablemaker.trueAction("/ThirdBook/Band_Thirteen/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event); 
         }
        
    }

    @FXML
    private void False(ActionEvent event) {
        Rules rules = new Rules();
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
        total=a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x;
         if(total<=17){
        draggablemaker.falseAction("/ThirdBook/Band_One/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=27){
        draggablemaker.falseAction("/ThirdBook/Band_Five/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=47){
        draggablemaker.falseAction("/ThirdBook/Band_Nine/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }
         else if(total<=74){
         draggablemaker.falseAction("/ThirdBook/Band_Thirteen/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event);
         }else{
        draggablemaker.falseAction("/ThirdBook/Band_Thirteen/One.fxml", event);
        rules.backrules22("/secondBook/Band_Eighteen/One.fxml",event); 
         }
    }
    
}
