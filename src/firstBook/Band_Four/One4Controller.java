/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Four;

import alert.AlertMaker;
import firstBook.Band_Five.Band_FiveController;
import firstBook.Band_One.OneController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.binding.Binding;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class One4Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText19;
    @FXML
    private ImageView threeLine;
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private Label counter;
 
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void five19(MouseEvent event) {
       
        //erorr Pane Content
        erorrText19.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(threeLine);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Two4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Two4.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_Three/Band_Three.fxml",event));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four19(MouseEvent event) {
        
        //erorr Pane Content
        erorrText19.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(threeLine);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Two4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Two4.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_Three/Band_Three.fxml",event));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three19(MouseEvent event) {
      
        //erorr Pane Content
        erorrText19.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(threeLine);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Two4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Two4.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_Three/Band_Three.fxml",event));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two19(MouseEvent event) {
        DegreeCount score = new DegreeCount();
        score.firstOne();
        score.firstOneVal();
        
        try {
            bandfivecontroller.succesSound();
            System.out.println(bandfivecontroller.degreeIncrees());
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Two4.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "أحسنت إجابة صحيحة", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @FXML
    private void one19(MouseEvent event) {
        
        //erorr Pane Content
        erorrText19.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(threeLine);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Two4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Two4.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_Three/Band_Three.fxml",event));
    }));
    timeline.play();
    //end method
    }
    
}
