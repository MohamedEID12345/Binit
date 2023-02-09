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
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import static javafx.util.Duration.minutes;
import report.DegreeCount;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class Band_FiveController extends DegreeCount implements Initializable {

    static int i = 0;
    static int y = 0;
    static int x = 0;
    static int s = 0;
    static int count = 0;
    static int num = 0;
    static int z = 0;
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

    public int degreeIncrees() {
        i++;
        y = 0;
        return i;
    }

    public int degreeDoubleIncreese() {
        i += 2;
        return i;
    }

    public int stoprules(MouseEvent event, String stopUrl) {
        y++;
        if (y == 4) {
            try {
                Parent part = FXMLLoader.load(getClass().getResource("/report/Data.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                y=0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("helloooooooooooooo");
                Parent part = FXMLLoader.load(getClass().getResource(stopUrl));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                y=0;
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return y;
    }

    public int stoprulesAction(ActionEvent actionevent, String stopUrl) {
        y++;
        if (y == 4) {
            try {
                Parent part = FXMLLoader.load(getClass().getResource("/report/Data.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                ((Node) (actionevent.getSource())).getScene().getWindow().hide();
                 y=0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Parent part = FXMLLoader.load(getClass().getResource(stopUrl));
                Stage stage = new Stage();
                Scene scene = new Scene(part);
                stage.setScene(scene);
                stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
                stage.show();
                y=0;
                ((Node) (actionevent.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return y;
    }

    public int countResult() {
        count = i;
        return count;
    }

    public int backrules(String url, MouseEvent event){
        x++;
        System.out.println("back rules= " + x);
        if (x == 2) {
            System.out.println("back rules= "+x);
            DegreeCount count = new DegreeCount();
           a =(count.firstOne()-1)-(count.firstOneVal()-1);
            System.out.println("the value of m = "+ a);
            
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
            x = 0;
            i = z;}catch (IOException e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    public int backrulesAction(String url, ActionEvent event) {
        x++;
        if (x == 2) {
            DegreeCount count = new DegreeCount();
           b =(count.firstTwo()-1)-(count.firstOneVal()-1);
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
                x = 0;
                i = z;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return y;
    }

    public int equation() {
        z = i;
        return z;
    }

    @FXML
    private void radio2(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Two/OneTF.fxml"));
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
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/One/One.fxml"));
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
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Three/One.fxml"));
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
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Four/One.fxml"));
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
    private void radio5(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Five/One.fxml"));
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
    private void radio6(ActionEvent event) {
        try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Six/One.fxml"));
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
    private void closed(MouseEvent event) {
        Platform.exit();
    }

    public void faillSound() {
        AudioClip buzzer = new AudioClip(getClass().getResource("/sound/faill.mp3").toExternalForm());
        buzzer.play();
    }

    public void succesSound() {
        AudioClip buzzer = new AudioClip(getClass().getResource("/sound/succes.mp3").toExternalForm());
        buzzer.play();
    }
    
    public int firststoprules(MouseEvent event) {
        s++;
        if (s == 3) {
            try {
                Parent part = FXMLLoader.load(getClass().getResource("/report/Data.fxml"));
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
        return s;
    }
}