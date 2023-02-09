/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Four;

import alert.AlertMaker;
import firstBook.Band_Five.Band_FiveController;
import firstBook.Band_One.OneController;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class Twelve4Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText30;
    @FXML
    private Pane pane30;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void five30(MouseEvent event) {
        
        //erorr Pane Content
        erorrText30.setText("لا إنت هتختار زي دي");
        pane30.setStyle("-fx-border-color:green");
       /////////////////////////////
       Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane30);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 String path = "E:\\Binit\\Test\\src\\sound\\choose.m4a";  
 Media media = new Media(new File(path).toURI().toString());  
 MediaPlayer mediaPlayer = new MediaPlayer(media);  
 mediaPlayer.setAutoPlay(true);  
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Thirteen4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Thirteen4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four30(MouseEvent event) {
        
        //erorr Pane Content
        erorrText30.setText("لا إنت هتختار زي دي");
        pane30.setStyle("-fx-border-color:green");
       /////////////////////////////
       Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane30);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 String path = "E:\\Binit\\Test\\src\\sound\\choose.m4a";  
 Media media = new Media(new File(path).toURI().toString());  
 MediaPlayer mediaPlayer = new MediaPlayer(media);  
 mediaPlayer.setAutoPlay(true);  
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
//        one.openStage(event, "/firstBook/Band_Four/Thirteen4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Thirteen4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three30(MouseEvent event) {
        
        //erorr Pane Content
        erorrText30.setText("لا إنت هتختار زي دي");
        pane30.setStyle("-fx-border-color:green");
       /////////////////////////////
       Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane30);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 String path = "E:\\Binit\\Test\\src\\sound\\choose.m4a";  
 Media media = new Media(new File(path).toURI().toString());  
 MediaPlayer mediaPlayer = new MediaPlayer(media);  
 mediaPlayer.setAutoPlay(true);  
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Thirteen4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Thirteen4.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two30(MouseEvent event) {
        try {
            DegreeCount score = new DegreeCount();
        score.firstOne();
        score.firstOneVal();
           
            System.out.println(bandfivecontroller.degreeDoubleIncreese());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Thirteen4.fxml"));
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
    private void one30(MouseEvent event) {
        
        //erorr Pane Content
        erorrText30.setText("لا إنت هتختار زي دي");
        pane30.setStyle("-fx-border-color:green");
       /////////////////////////////
       Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane30);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 String path = "E:\\Binit\\Test\\src\\sound\\choose.m4a";  
 Media media = new Media(new File(path).toURI().toString());  
 MediaPlayer mediaPlayer = new MediaPlayer(media);  
 mediaPlayer.setAutoPlay(true);  
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
//        one.openStage(event, "/firstBook/Band_Four/Thirteen4.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Thirteen4.fxml"));
    }));
    timeline.play();
    //end method
    }
    
}
