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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class FourController implements Initializable {
OneController one=new OneController();
    @FXML
    private AnchorPane anchoreFoure;
    @FXML
    private ImageView bluecircle;
    @FXML
    private Label erorrText4;
Band_FiveController bandfivecontroller=new Band_FiveController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void one4(MouseEvent event) {
        
        //erorr Pane Content
        erorrText4.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(bluecircle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/Band_Two.fxml"));
        //one.openStage(event, "/firstBook/Band_two/Band_Two.fxml");
                System.out.println("the new value is"+bandfivecontroller.equation());

    }));
    timeline.play();
    //end method

    }

    @FXML
    private void two4(MouseEvent event) {
         
        //erorr Pane Content
        erorrText4.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(bluecircle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/Band_Two.fxml"));
        //one.openStage(event, "/firstBook/Band_two/Band_Two.fxml");
                System.out.println("the new value is"+bandfivecontroller.equation());

    }));
    timeline.play();
    //end method

    }

    @FXML
    private void three4(MouseEvent event){ 
            DegreeCount score = new DegreeCount();
        score.firstOne();
        
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_two/Band_Two.fxml"));
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
    }

    @FXML
    private void four4(MouseEvent event) {
         
        //erorr Pane Content
        erorrText4.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(bluecircle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/Band_Two.fxml"));
        //one.openStage(event, "/firstBook/Band_two/Band_Two.fxml");
                System.out.println("the new value is"+bandfivecontroller.equation());

    }));
    timeline.play();
    //end method

    }

    @FXML
    private void five4(MouseEvent event) {
        
        //erorr Pane Content
        erorrText4.setText("لا إنت هتختار زي دي");
        one.paneContentMessage(bluecircle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
       System.out.println(bandfivecontroller.stoprules(event,"/firstBook/Band_two/Band_Two.fxml"));
        //one.openStage(event, "/firstBook/Band_two/Band_Two.fxml");
       System.out.println("the new value is"+bandfivecontroller.equation());

    }));
    timeline.play();
    //end method

    }
    
}
