/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_One;

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
public class TwoController implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private AnchorPane anchoreTwo;

OneController one=new OneController();
    @FXML
    private ImageView blueTriangle;
    @FXML
    private Label erorrText2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void choose(MouseEvent event) {
        try {
            System.out.println(bandfivecontroller.degreeIncrees());
            bandfivecontroller.succesSound();
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_One/Three.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "?????????? ?????????? ??????????", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @FXML
    private void paneTwo(MouseEvent event) {
        //erorr Pane Content
        erorrText2.setText("???? ?????? ???????????? ???? ????");
        one.paneContentMessage(blueTriangle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void paneThree(MouseEvent event) {
        //erorr Pane Content
        erorrText2.setText("???? ?????? ???????????? ???? ????");
        one.paneContentMessage(blueTriangle);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
        one.openStage(event, "/firstBook/finallPage/Score.fxml");
    }));
    timeline.play();
    //end method
    }
    
}
