/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Twoelve;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class FiveController implements Initializable {

    @FXML
    private Pane false1;
    @FXML
    private Pane false2;
    @FXML
    private Pane false3;
    @FXML
    private Pane true1;
    @FXML
    private Pane false4;
DraggableMaker draggablemaker = new DraggableMaker();
firstBook.Band_One.OneController one=new firstBook.Band_One.OneController();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void False1(MouseEvent event) {
        one.paneContentMessage2(true1);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
     draggablemaker.falseAction2("/secondBook/Band_Twoelve/Six.fxml", event);
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void False2(MouseEvent event) {
        one.paneContentMessage2(true1);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
     draggablemaker.falseAction2("/secondBook/Band_Twoelve/Six.fxml", event);
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void False3(MouseEvent event) {
        one.paneContentMessage2(true1);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
     draggablemaker.falseAction2("/secondBook/Band_Twoelve/Six.fxml", event);
    }));
    timeline.play();
    //end method
    }

    @FXML
    private void True1(MouseEvent event) {
        draggablemaker.trueAction2("/secondBook/Band_Twoelve/Six.fxml", event);
    }

    @FXML
    private void False4(MouseEvent event) {
        one.paneContentMessage2(true1);
        //open new scane
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
     draggablemaker.falseAction2("/secondBook/Band_Twoelve/Six.fxml", event);
    }));
    timeline.play();
    //end method
    }
    
}
