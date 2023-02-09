/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.Four;

import com.jfoenix.controls.JFXRadioButton;
import firstBook.Band_Five.Band_FiveController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class TwoController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private JFXRadioButton true11;
    @FXML
    private ToggleGroup band11;
    @FXML
    private JFXRadioButton false11;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True11(ActionEvent event) {
        if(true11.isSelected()){
            DegreeCount score = new DegreeCount();
        score.firstTwo();
        score.firstOneVal();
         
        try {
             bandfivecontroller.succesSound();
         System.out.println(bandfivecontroller.degreeIncrees());
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/Four/Three.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void False11(ActionEvent event) {
        if(false11.isSelected()){
            
            bandfivecontroller.faillSound();
            //System.out.println(bandfivecontroller.degreeDecreese());
//        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Four/Three.fxml"));
//        Stage stage = new Stage();
//        Scene scene = new Scene(part);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
System.out.println(bandfivecontroller.stoprulesAction(event,"/firstBook/Band_Five/Four/Three.fxml"));
    System.out.println(bandfivecontroller.backrulesAction( "/firstBook/Band_Five/Three/One.fxml",event));
        }
    }
    
}
