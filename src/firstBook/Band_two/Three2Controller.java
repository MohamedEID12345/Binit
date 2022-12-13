/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_two;

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
public class Three2Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrTet7;
    @FXML
    private ImageView twocolumn7;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
    }    

    @FXML
    private void one7(MouseEvent event) {
        //erorr Pane Content
        erorrTet7.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(twocolumn7);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       System.out.println("the reseet value is: "+bandfivecontroller.reseet());
       // one.openStage(event, "/firstBook/Band_two/four2.fxml");
         System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/four2.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two7(MouseEvent event) {
        //erorr Pane Content
        erorrTet7.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(twocolumn7);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        //one.openStage(event, "/firstBook/Band_two/four2.fxml");
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/four2.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three7(MouseEvent event) {
        //erorr Pane Content
        erorrTet7.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(twocolumn7);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
       // one.openStage(event, "/firstBook/Band_two/four2.fxml");
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/four2.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four7(MouseEvent event) {
        //erorr Pane Content
        erorrTet7.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(twocolumn7);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        //one.openStage(event, "/firstBook/Band_two/four2.fxml");
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/four2.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void five7(MouseEvent event) {
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            System.out.println("the reseet value is: "+bandfivecontroller.reseet());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_two/four2.fxml"));
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
