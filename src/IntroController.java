/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class IntroController implements Initializable {

    @FXML
    private ImageView logo;
    @FXML
    private Circle close2;
    @FXML
    private JFXButton start;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setRotate(logo, true, 360, 20);
        
    } 
    
//    Logo Animation Function
    private void setRotate(ImageView c, boolean reverse, int angle, int duration){
        RotateTransition rt = new RotateTransition(Duration.seconds(duration),c);
        rt.setAutoReverse(reverse);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
        rt.setRate(10);
        rt.setCycleCount(1);
        rt.play();
    }

    @FXML
    private void exite(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void start(MouseEvent event) throws IOException {
        try {
        Parent part = FXMLLoader.load(getClass().getResource("/ThirdBook/Band_One/One.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();}
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
