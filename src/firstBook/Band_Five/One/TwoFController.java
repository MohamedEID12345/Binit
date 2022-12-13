/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.One;

import com.jfoenix.controls.JFXRadioButton;
import firstBook.Band_Five.Band_FiveController;
import firstBook.Band_Five.Count;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class TwoFController implements Initializable {
 Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private JFXRadioButton true2;
    @FXML
    private JFXRadioButton false2;
    @FXML
    private ToggleGroup band2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True2(ActionEvent event) {
        if(true2.isSelected()){
            
        try {
         System.out.println(bandfivecontroller.degreeIncrees());
         bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/One/ThreeF.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();}
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void False2(ActionEvent event) {
        if(false2.isSelected()){
            bandfivecontroller.faillSound();
            //System.out.println(bandfivecontroller.degreeDecreese());
//        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/finallPage/Score.fxml"));
//        Stage stage = new Stage();
//        Scene scene = new Scene(part);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
System.out.println(bandfivecontroller.stoprulesAction(event,"/firstBook/finallPage/Score.fxml"));
           
        }
    }
    
}
