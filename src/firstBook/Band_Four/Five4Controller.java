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
public class Five4Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText23;
    @FXML
    private ImageView true23;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void four23(MouseEvent event) {
       
        //erorr Pane Content
        erorrText23.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true23);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Six4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Six4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three23(MouseEvent event) {
        
        //erorr Pane Content
        erorrText23.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true23);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Six4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Six4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two23(MouseEvent event) {
       
        //erorr Pane Content
        erorrText23.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true23);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Six4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Six4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void one23(MouseEvent event) {
       
        //erorr Pane Content
        erorrText23.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(true23);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Six4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Six4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void five23(MouseEvent event) {
        DegreeCount score = new DegreeCount();
        score.firstOne();
        score.firstOneVal();
       
        try {
            bandfivecontroller.succesSound();
            System.out.println(bandfivecontroller.degreeDoubleIncreese());
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Six4.fxml"));
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
    
}
