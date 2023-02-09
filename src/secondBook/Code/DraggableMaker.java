/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondBook.Code;

import alert.AlertMaker;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DraggableMaker {
 private double mouseAnchorX;
    private double mouseAnchorY;

    public void makeDraggable(Node node){

        node.setOnMousePressed(mouseEvent -> {
            mouseAnchorX = mouseEvent.getX();
            mouseAnchorY = mouseEvent.getY();
            AudioClip buzzer = new AudioClip(getClass().getResource("/sound/MouseClick.mp3").toExternalForm());
        buzzer.play();
        });

        node.setOnMouseDragged(mouseEvent -> {
            node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
            node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
        node.setOnMouseReleased(mouseEvent ->{
        AudioClip buzzer = new AudioClip(getClass().getResource("/sound/WaterDrop.mp3").toExternalForm());
        buzzer.play();  
    });
    }
    //true action
    public int trueAction(String url,ActionEvent event) {
             try {
                 AudioClip buzzer = new AudioClip(getClass().getResource("/sound/succes.mp3").toExternalForm());
        buzzer.play();
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "أحسنت إجابة صحيحة", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
     return 1;
         }
      //false action
    public int falseAction(String url,ActionEvent event) {
             try {
                 AudioClip buzzer = new AudioClip(getClass().getResource("/sound/faill.mp3").toExternalForm());
        buzzer.play();
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                                    AlertMaker.showNotification("", "إجابة خاطئة يلا نشوف إلي بعده", AlertMaker.image_warning);

            } catch (IOException e) {
                e.printStackTrace();
            }
     return 0;
         } 
    public int trueAction2(String url,MouseEvent event) {
             try {
                  AudioClip buzzer = new AudioClip(getClass().getResource("/sound/succes.mp3").toExternalForm());
        buzzer.play();
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "أحسنت إجابة صحيحة", AlertMaker.image_checked);
            } catch (IOException e) {
                e.printStackTrace();
            }
     return 1;
         } 
    public int falseAction2(String url,MouseEvent event) {
             try {
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                AlertMaker.showNotification("", "إجابة خاطئة يلا نشوف إلي بعده", AlertMaker.image_warning);            } catch (IOException e) {
                e.printStackTrace();
            }
     return 0;
         } 
}