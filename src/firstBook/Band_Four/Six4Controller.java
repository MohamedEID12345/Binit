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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class Six4Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private ImageView true24;
    @FXML
    private Label erorrText24;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void five24(MouseEvent event) {
        //erorr Pane Content
        erorrText24.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true24);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Seven4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Seven4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four24(MouseEvent event) {
        //erorr Pane Content
        erorrText24.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true24);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       // one.openStage(event, "/firstBook/Band_Four/Seven4.fxml");
         System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Seven4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three24(MouseEvent event) {
        //erorr Pane Content
        erorrText24.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true24);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       // one.openStage(event, "/firstBook/Band_Four/Seven4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Seven4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two24(MouseEvent event) {
        //erorr Pane Content
        erorrText24.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true24);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       // one.openStage(event, "/firstBook/Band_Four/Seven4.fxml");
         System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Seven4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void one24(MouseEvent event) {
        try {
            bandfivecontroller.succesSound();
            System.out.println(bandfivecontroller.degreeDoubleIncreese());
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Seven4.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "أحسنت إجابة صحيحة", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
