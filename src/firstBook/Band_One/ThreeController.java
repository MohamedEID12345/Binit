/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_One;

import alert.AlertMaker;
import firstBook.Band_Five.Band_FiveController;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ThreeController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private AnchorPane anchoreThree;
    @FXML
    private Label erorrText3;
    @FXML
    private Pane paneThree;
    @FXML
    private ImageView greenmok3b;

    OneController one=new OneController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void one3(MouseEvent event) {
        //erorr Pane Content
        erorrText3.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(greenmok3b);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method

    }
    
    @FXML
    private void two3(MouseEvent event) {
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_One/Four.fxml"));
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

    @FXML
    private void three3(MouseEvent event) {
        //erorr Pane Content
        erorrText3.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(greenmok3b);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four3(MouseEvent event) {
        //erorr Pane Content
        erorrText3.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(greenmok3b);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void five3(MouseEvent event) {
        //erorr Pane Content
        erorrText3.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(greenmok3b);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }
    
}
