/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.One;

import Login.LoginController;
import com.jfoenix.controls.JFXRadioButton;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javaws.Main;
import firstBook.Band_Five.Band_FiveController;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class OneController implements Initializable{
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private RadioButton true1;
    @FXML
    private RadioButton false1;
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
    private void True1(ActionEvent event){
        if(true1.isSelected()){
     
            try {
        DegreeCount score = new DegreeCount();
        score.firstTwo();
        score.reseetFirstOneVal();
        score.firstOneVal();
           
        System.out.println(bandfivecontroller.degreeIncrees());
        bandfivecontroller.succesSound();
        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/One/TwoF.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
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
    private void False1(ActionEvent event) {
        if(false1.isSelected()){
             
            try {
           bandfivecontroller.faillSound();
        //System.out.println(bandfivecontroller.degreeDecreese());
        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/finallPage/Score.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
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
    
}
