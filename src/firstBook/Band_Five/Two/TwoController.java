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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class TwoController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();

    @FXML
    private JFXRadioButton true5;
    @FXML
    private ToggleGroup band5;
    @FXML
    private JFXRadioButton false5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True5(ActionEvent event) {
        if(true5.isSelected()){
            
        try {
         System.out.println(bandfivecontroller.degreeIncrees());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/firstBook/Band_Five/Three/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());}
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

    @FXML
    private void False5(ActionEvent event) {
        if(false5.isSelected()){
            //System.out.println(bandfivecontroller.degreeDecreese());
            bandfivecontroller.faillSound();
            //        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Three/One.fxml"));
//        Stage stage = new Stage();
//        Scene scene = new Scene(part);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
System.out.println("the new value is"+bandfivecontroller.equation());
System.out.println(bandfivecontroller.stoprulesAction(event,"/firstBook/Band_Five/Three/One.fxml"));
System.out.println(bandfivecontroller.backrulesAction( "/firstBook/Band_Five/One/One.fxml",event));
    }
    }    
}
