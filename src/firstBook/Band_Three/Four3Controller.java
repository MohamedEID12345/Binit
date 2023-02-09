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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class Four3Controller implements Initializable {
OneController one=new OneController();
    @FXML
    private Label erorrText17;
    @FXML
    private ImageView redCircleTwo17;
    @FXML
    private ImageView greenTriangleOne17;
    @FXML
    private Pane checkk;
    int item=0;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void one17(MouseEvent event) {
                            
                            if(item==1){
            try {
                DegreeCount score = new DegreeCount();
        score.firstOne();
        score.firstOneVal();
                
                bandfivecontroller.succesSound();
                System.out.println(bandfivecontroller.degreeIncrees());
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Band_Four.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                System.out.println("the new value is"+bandfivecontroller.equation());
                AlertMaker.showNotification("", "أحسنت إجابة صحيحة", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
        
            //erorr Pane Content
        erorrText17.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(greenTriangleOne17);
        one.paneContentMessage(redCircleTwo17);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Band_Four.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Band_Four.fxml"));
        System.out.println("the new value is"+bandfivecontroller.equation());
    }));
    timeline.play();
    //end method
        }
    }

    @FXML
    private void two17(MouseEvent event) {
      
//erorr Pane Content
        erorrText17.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(redCircleTwo17);
        one.paneContentMessage(greenTriangleOne17);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Band_Four.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Band_Four.fxml"));
        System.out.println("the new value is"+bandfivecontroller.equation());
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void three17(MouseEvent event) {
        
        //erorr Pane Content
        erorrText17.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(redCircleTwo17);
        one.paneContentMessage(greenTriangleOne17);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Band_Four.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Band_Four.fxml"));
        System.out.println("the new value is"+bandfivecontroller.equation());
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void four17(MouseEvent event) {
        
        //erorr Pane Content
        erorrText17.setText("لا إنت هتختار زي دول");
        one.paneContentMessage(redCircleTwo17);
        one.paneContentMessage(greenTriangleOne17);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        //one.openStage(event, "/firstBook/Band_Four/Band_Four.fxml");
        System.out.println(bandfivecontroller.stoprules(event, "/firstBook/Band_Four/Band_Four.fxml"));
        System.out.println("the new value is"+bandfivecontroller.equation());
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void five17(MouseEvent event) {
        checkk.setStyle("-fx-border-color: #70e000");
                            AlertMaker.showNotification("", "شاطر فاضل كدا واحدة", AlertMaker.image_checked);  
                            item++;
    }
    
}
