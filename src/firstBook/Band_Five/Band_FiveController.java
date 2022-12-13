/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five;

import alert.AlertMaker;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import static javafx.util.Duration.minutes;
/**
 * FXML Controller class
 *
 * @author eid
 */
public class Band_FiveController implements Initializable {

       static int i=0;   
       static int y=0;
       static int x=0;
       static int count=0;
       static int num=0;
       static int z=0;
    @FXML
    private RadioButton secondRadio;
    @FXML
    private ToggleGroup choose;
    @FXML
    private RadioButton firstRadio;
    @FXML
    private RadioButton thirdRadio;
    @FXML
    private RadioButton fourthRadio;
    @FXML
    private RadioButton fourthRadio1;
    @FXML
    private ToggleGroup choose1;
    @FXML
    private RadioButton fourthRadio11;
    @FXML
    private ToggleGroup choose11;
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
 
    }    
    public int degreeIncrees(){
        i++;
        y=0;
        return i;
    }
     public int degreeDoubleIncreese(){
         i+=2;
        return i;
    }
     public int stoprules(MouseEvent event,String stopUrl) {
         y++;
         if(y==4){
             try {
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/finallPage/Score.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
         }else{
             try {
                 System.out.println("helloooooooooooooo");
                Parent part = FXMLLoader.load(getClass().getResource(stopUrl));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
         }
         return y;
     }
     public int stoprulesAction(ActionEvent actionevent,String stopUrl) {
         y++;
         if(y==4){
             try {
                Parent part = FXMLLoader.load(getClass().getResource("/firstBook/finallPage/Score.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (actionevent.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
         }else{
             try {
                Parent part = FXMLLoader.load(getClass().getResource(stopUrl));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (actionevent.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
         }
         return y;
     }
     public int countResult(){
    count =i;
    return count;
}
     public int backrules(String url,MouseEvent event) {
         x++;
//         if(x==3){
//              try {
//             Parent part = FXMLLoader.load(getClass().getResource(defaultUrl));
//                Stage stage = new Stage();
//                Scene scene = new Scene(part);
//                stage.setScene(scene);
//                stage.initStyle(StageStyle.UNDECORATED);
//                stage.show();
//                ((Node) (event.getSource())).getScene().getWindow().hide();}
//              catch (IOException e) {
//                e.printStackTrace();
//            }
//         }
          if(x==2){
             try {
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                x=0;
                i=z;
            } catch (IOException e) {
                e.printStackTrace();
            }
         }
         return y;
     }
     public int backrulesAction(String url,ActionEvent event) {
         x++;
//         if(x==1){
//              try {
//             Parent part = FXMLLoader.load(getClass().getResource(defaultUrl));
//                Stage stage = new Stage();
//                Scene scene = new Scene(part);
//                stage.setScene(scene);
//                stage.initStyle(StageStyle.UNDECORATED);
//                stage.show();
//                ((Node) (event.getSource())).getScene().getWindow().hide();}
//              catch (IOException e) {
//                e.printStackTrace();
//            }
//         }
          if(x==2){
             try {
                Parent part = FXMLLoader.load(getClass().getResource(url));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                x=0;
                i=z;
            } catch (IOException e) {
                e.printStackTrace();
            }
         }
         return y;
     }
    public int equation(){
    z =i;
    return z;
} 
    public int reseet(){
    x =0;
    return x;
} 

    @FXML
    private void radio2(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Two/OneTF.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio1(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/One/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio3(ActionEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Three/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio4(ActionEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Four/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio5(ActionEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Five/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void radio6(ActionEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Six/One.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void closed(MouseEvent event) {
        Platform.exit();
    }
    public void faillSound(){
    AudioClip buzzer = new AudioClip(getClass().getResource("/sound/faill.mp3").toExternalForm());
        buzzer.play();  
}
    public void succesSound(){
    AudioClip buzzer = new AudioClip(getClass().getResource("/sound/succes.mp3").toExternalForm());
    buzzer.play();  
}
    }

