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
public class Band_TwoController implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText5;
    @FXML
    private ImageView geensquare2;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void one5(MouseEvent event) {
        //erorr Pane Content
        erorrText5.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(geensquare2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_two/two2.fxml");
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/two2.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_One/One.fxml",event));

    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two5(MouseEvent event) {
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_two/two2.fxml"));
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
    private void three5(MouseEvent event) {
        //erorr Pane Content
        erorrText5.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(geensquare2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       
        //one.openStage(event, "/firstBook/Band_two/two2.fxml");
         System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/two2.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_One/One.fxml",event));

    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four5(MouseEvent event) {
        //erorr Pane Content
        erorrText5.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(geensquare2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        
        //one.openStage(event, "/firstBook/Band_two/two2.fxml");
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/two2.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_One/One.fxml",event));

    }));
    timeline.play();
    //end method
    }

    @FXML
    private void five5(MouseEvent event) {
        //erorr Pane Content
        erorrText5.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(geensquare2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       
        //one.openStage(event, "/firstBook/Band_two/two2.fxml");
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/two2.fxml"));
        System.out.println(bandfivecontroller.backrules("/firstBook/Band_One/One.fxml",event));
    }));
    timeline.play();
    //end method
    }
    
}
