/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.Band_Five.Six;

import alert.AlertMaker;
import com.jfoenix.controls.JFXRadioButton;
import firstBook.Band_Five.Band_FiveController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import report.DegreeCount;


/**
 * FXML Controller class
 *
 * @author eid
 */
public class TwoentyFourController extends DegreeCount implements Initializable {
Band_FiveController bandfivecontroller=new Band_FiveController();
    @FXML
    private JFXRadioButton dargteen44;
    @FXML
    private ToggleGroup band44;
    @FXML
    private JFXRadioButton darga44;
    @FXML
    private JFXRadioButton zero44;
    int degree=0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Dargteen44(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.firstTwo();
        score.firstTwo();
        score.firstOneVal();
        score.firstOneVal();
        degree= a+b;
        System.out.println("the total of degree= "+degree);
        if(degree<=6){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_One/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=14){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Three/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png")); 
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=24){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Seven/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=30){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Eleven/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=36){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Fiveteen/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }else{
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Fiveteen/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
//        if(dargteen44.isSelected()){
//            DegreeCount score = new DegreeCount();
//        score.firstTwo();
//        score.firstTwo();
//        score.firstOneVal();
//        score.firstOneVal();
//            InsertRecords app = new InsertRecords();   
//        app.insert(2,"ffs24"); 
//        try {
//         System.out.println(bandfivecontroller.degreeDoubleIncreese());
//          bandfivecontroller.succesSound();
//        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_One/One.fxml"));
//        Parent root=loader.load();
//        Stage stage = new Stage();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
//        System.out.println("the new value is"+bandfivecontroller.equation());
//        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);
//
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//        }
    }

    @FXML
    private void Darga44(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.firstTwo();
        score.firstOneVal();
        degree= a+b;
        System.out.println("the total of degree= "+degree);
                if(degree<=6){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_One/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=14){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Three/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=24){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Seven/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=30){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Eleven/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(degree<=36){
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Fiveteen/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }else{
            try {
         System.out.println(bandfivecontroller.degreeDoubleIncreese());
          bandfivecontroller.succesSound();
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_Fiveteen/One.fxml"));
        Parent root=loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.out.println("the new value is"+bandfivecontroller.equation());
        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجتين", AlertMaker.image_checked);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
//        if(darga44.isSelected()){
//            DegreeCount score = new DegreeCount();
//        score.firstTwo();
//        score.firstOneVal();
//            InsertRecords app = new InsertRecords();   
//        app.insert(1,"ffs24");
//        try {
//         System.out.println(bandfivecontroller.degreeIncrees());
//          bandfivecontroller.succesSound();
//        FXMLLoader loader =new FXMLLoader(getClass().getResource("/secondBook/Band_One/One.fxml"));
//        Parent root=loader.load();
//        Stage stage = new Stage();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
//        System.out.println("the new value is"+bandfivecontroller.equation());
//        AlertMaker.showNotification("", "أحسنت لقد حصلت على درجة واحدة", AlertMaker.image_checked);
//
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }}
    }

    @FXML
    private void Zero44(ActionEvent event) {
        degree= a+b;
        System.out.println("the total of degree= "+degree);
        if(degree<=6){
            bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_One/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
        }
        else if(degree<=14){
            bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_Three/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
        }
        else if(degree<=24){
           bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_Seven/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
        }
        else if(degree<=30){
            bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_Eleven/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
        }
        else if(degree<=36){
            bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_Fiveteen/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
        }else{
          bandfivecontroller.faillSound();
System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_Fiveteen/One.fxml"));
System.out.println("the new value is"+bandfivecontroller.equation());
AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);  
        }
//        if(zero44.isSelected()){
//            InsertRecords app = new InsertRecords();   
//        app.insert(0,"ffs24");
//            bandfivecontroller.faillSound();
//System.out.println(bandfivecontroller.stoprulesAction(event,"/secondBook/Band_One/One.fxml"));
//System.out.println("the new value is"+bandfivecontroller.equation());
//AlertMaker.showNotification("خطأ", "إجابة خاطئة...", AlertMaker.image_warning);
//    }
//    
    }
    
}
