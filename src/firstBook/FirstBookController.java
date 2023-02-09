/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class FirstBookController implements Initializable {

   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void closed(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void radio2(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_two/Band_Two.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
                stage.setTitle("E-SBIS-5");
                stage.getIcons().add(new Image("/image/icon.png"));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio1(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_One/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
                stage.setTitle("E-SBIS-5");
                stage.getIcons().add(new Image("/image/icon.png"));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio3(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Three/Band_Three.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
                stage.setTitle("E-SBIS-5");
                stage.getIcons().add(new Image("/image/icon.png"));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio4(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Four/Band_Four.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
                stage.setTitle("E-SBIS-5");
                stage.getIcons().add(new Image("/image/icon.png"));
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    }


    
