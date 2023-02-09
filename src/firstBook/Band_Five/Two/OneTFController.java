/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.Two;

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
public class OneTFController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private JFXRadioButton true4;
    @FXML
    private ToggleGroup band4;
    @FXML
    private JFXRadioButton false4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True4(ActionEvent event) {
        if(true4.isSelected()){
            DegreeCount score = new DegreeCount();
        score.firstTwo();
        score.reseetFirstOneVal();
        score.firstOneVal();

        try {
         System.out.println(bandfivecontroller.degreeIncrees());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/Two/Two.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();}
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void False4(ActionEvent event) {
        if(false4.isSelected()){
        
            //System.out.println(bandfivecontroller.degreeDecreese());
            bandfivecontroller.faillSound();
//        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Two/Two.fxml"));
//        Stage stage = new Stage();
//        Scene scene = new Scene(part);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
System.out.println(bandfivecontroller.stoprulesAction(event,"/firstBook/Band_Five/Two/Two.fxml"));
    System.out.println(bandfivecontroller.backrulesAction( "/firstBook/Band_Five/One/One.fxml",event));       
        }
    }
    
}
