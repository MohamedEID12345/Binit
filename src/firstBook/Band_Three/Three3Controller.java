/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Three;

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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class Three3Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText16;
    @FXML
    private ImageView star1green;
    @FXML
    private ImageView redTriangle2;
    @FXML
    private Pane checkOne16;
    @FXML
    private Pane checkTwo16;
    @FXML
    private ImageView image1;
  Band_FiveController bandfivecontroller=new Band_FiveController();
int item=0;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void one16(MouseEvent event) {
        //erorr Pane Content
        erorrText16.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(star1green);
        one.paneContentMessage(redTriangle2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       // one.openStage(event, "/firstBook/Band_Three/four3.fxml");
       System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Three/four3.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void two16(MouseEvent event) {
        //erorr Pane Content
        erorrText16.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(star1green);
        one.paneContentMessage(redTriangle2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        //one.openStage(event, "/firstBook/Band_Three/four3.fxml");
       System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Three/four3.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three16(MouseEvent event) {
        //erorr Pane Content
        erorrText16.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(star1green);
        one.paneContentMessage(redTriangle2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        //one.openStage(event, "/firstBook/Band_Three/four3.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Three/four3.fxml"));
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four16(MouseEvent event) {
                    checkOne16.setStyle("-fx-border-color: #70e000");
                            AlertMaker.showNotification("", "شاطر فاضل كدا واحدة", AlertMaker.image_checked);  
                            item++;
    }

    @FXML
    private void five16(MouseEvent event) {
        if(item==1){
            try {
                bandfivecontroller.succesSound();
                System.out.println("the reseet value is: "+bandfivecontroller.reseet());
                System.out.println(bandfivecontroller.degreeIncrees());
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Three/four3.fxml"));
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
        }else{
            //erorr Pane Content
        erorrText16.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(star1green);
        one.paneContentMessage(redTriangle2);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Three/four3.fxml");
        System.out.println("the reseet value is: "+bandfivecontroller.reseet());
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Three/four3.fxml"));
    }));
    timeline.play();
    //end method
        }
        
    }
    
}
