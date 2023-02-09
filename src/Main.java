/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.awt.Dimension;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.ImageIcon;

/**
 *
 * @author eid
 */

public class Main extends Application {
    //Connect con=new Connect();
    //Create create=new Create();
   
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root= FXMLLoader.load(getClass().getResource("/Intro.fxml"));
        Scene scene = new Scene(root, 590, 293);
        primaryStage.setTitle("E-SBIS-5");
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
       
        primaryStage.show();
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); 
    }
}
