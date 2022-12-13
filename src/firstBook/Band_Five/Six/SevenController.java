/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.Six;

import alert.AlertMaker;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class SevenController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private JFXRadioButton dargteen27;
    @FXML
    private ToggleGroup band27;
    @FXML
    private JFXRadioButton darga27;
    @FXML
    private JFXRadioButton zero27;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Dargteen27(ActionEvent event) {
        if(dargteen27.isSelected()){
            
        try {
             bandfivecontroller.succesSound();
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/Six/Eight.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void Darga27(ActionEvent event) {
        if(darga27.isSelected()){
            
        try {
             bandfivecontroller.succesSound();
         System.out.println(bandfivecontroller.degreeIncrees());
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/Six/Eight.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجة واحدة", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void Zero27(ActionEvent event) {
        if(zero27.isSelected()){
            bandfivecontroller.faillSound();
            //System.out.println(bandfivecontroller.degreeDecreese());
//        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Six/Eight.fxml"));
//        Stage stage = new Stage();
//        Scene scene = new Scene(part);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
System.out.println(bandfivecontroller.stoprulesAction(event,"/firstBook/Band_Five/Six/Eight.fxml"));
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
    }
    }
    
}
