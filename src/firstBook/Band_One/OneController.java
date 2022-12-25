package firstBook.Band_One;

import alert.AlertMaker;
import firstBook.Band_Five.Band_FiveController;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class OneController implements Initializable {
    @FXML
    private Label erorrText;
    @FXML
    private ImageView pane3;
    @FXML
    private AnchorPane anchoreOne;
Band_FiveController bandfivecontroller=new Band_FiveController();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }

    @FXML
    private void paneTwo(MouseEvent event) {
      //erorr Pane Content
      erorrText.setText("لا إنت هتختار زي دي");
        paneContentMessage(pane3);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method  
    }
    @FXML
    private void paneThree(MouseEvent event) {
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_One/Two.fxml"));
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
    private void paneFoure(MouseEvent event) {
        //erorr Pane Content
        erorrText.setText("لا إنت هتختار زي دي");
        paneContentMessage(pane3);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }


    public void openStage(MouseEvent event,String url){
        try {
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
     public void paneContentMessage(ImageView pane){
        
        //erorrText.setText("لا إنت هتختار زي دي");
        //Duration = 2.5 seconds
    Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 AudioClip buzzer = new AudioClip(getClass().getResource("/sound/choose.m4a").toExternalForm());
        buzzer.play();  

    }
     public void paneContentMessage2(Pane pane){
        
        //erorrText.setText("لا إنت هتختار زي دي");
        //Duration = 2.5 seconds
    Duration duration = Duration.millis(2500);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration,pane);
    //Set how much X should enlarge
    scaleTransition.setByX(0.7);
    //Set how much Y should
    scaleTransition.setByY(0.7);
    scaleTransition.play();
    //sound
 AudioClip buzzer = new AudioClip(getClass().getResource("/sound/choose.m4a").toExternalForm());
        buzzer.play();  

    }
}
