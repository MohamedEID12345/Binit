/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package report;

import alert.AlertMaker;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JTextField;
import jdk.nashorn.internal.runtime.PropertyDescriptor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class DataController extends ReportController implements Initializable {

    @FXML
    private JFXTextField names;
    @FXML
    private JFXTextField tday1;
    @FXML
    private JFXTextField tmonth1;
    @FXML
    private JFXTextField tyear1;
    @FXML
    private JFXTextField tday2;
    @FXML
    private JFXTextField tmonth2;
    @FXML
    private JFXTextField tyear2;
    @FXML
    private JFXTextField tnl1;
    @FXML
    private JFXTextField tnl2;
    @FXML
    private JFXTextField tl1;
    @FXML
    private JFXTextField tl2;
    //add string to equal by textfield
public String tgName;
public String tgFahes;
public String tgSchool;
public String tgGenders;
public String tgCard;
public String tgClass;
public int day1;
public int day2;
//public int day3;
public int month1;
public int month2;
//public int month3;
public int year1;
public int year2;
//public int year3;
public String nl1;
public String nl2;
public String l1;
public String l2;
//end
    @FXML
    private JFXTextField schoolss;
    @FXML
    private JFXComboBox genderss;
    @FXML
    private JFXTextField cardss;
    @FXML
    private JFXTextField classNumss;
    @FXML
    private JFXTextField fahesNames;
    @FXML
    private Label select;
   

    @FXML
    private Label select1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       genderss.getItems().addAll("ذكر", "أنثى");
    }

    @FXML
    public void EnterData(MouseEvent event) throws IOException{
        //string = textfield
       tgName=names.getText();
       tgFahes=fahesNames.getText();
       tgSchool=schoolss.getText();
       tgGenders=genderss.getValue().toString();
       tgCard=cardss.getText();
       tgClass=classNumss.getText();
       //Data Of Table
       day1= Integer.parseInt(tday1.getText());
       day2= Integer.parseInt(tday2.getText());
       month1= Integer.parseInt(tmonth1.getText());
       month2= Integer.parseInt(tmonth2.getText());
       year1= Integer.parseInt(tyear1.getText());
       year2= Integer.parseInt(tyear2.getText());
       nl1=tnl1.getText();
       nl2=tnl2.getText();
       l1=tl1.getText();
       l2=tl2.getText();

LocalDate birthdate =LocalDate.of((year2), month2, day2);
LocalDate now =LocalDate.of(year1,month1,day1);
Period p = Period.between(birthdate, now);
System.out.println(p.getDays());    //9
System.out.println(p.getMonths());  //0
System.out.println(p.getYears());   //42
       //end
       
       //set data in other controller
       static_name=new Label(tgName);
       static_fahes=new Label(tgFahes);
       static_scholl=new Label(tgSchool);
       static_gender=new Label(tgGenders);
       static_card=new Label(tgCard);
       static_class=new Label(tgClass);
       
       static_c1=new Label(Integer.toString(day1));
       static_c2=new Label(Integer.toString(month1));
       static_c3=new Label(Integer.toString(year1));
       static_c4=new Label(Integer.toString(day2));
       static_c5=new Label(Integer.toString(month2));
       static_c6=new Label(Integer.toString(year2));
       static_c7=new Label (Integer.toString(p.getDays()));
       static_c8=new Label(Integer.toString(p.getMonths()));
       static_c9=new Label(Integer.toString(p.getYears()));
       static_c10=new Label(nl1);
       static_c11=new Label(nl2);
       static_c12=new Label(l1);
       static_c13=new Label(l2);


        try {
            if(names.getText().isEmpty()||tday1.getText().isEmpty()||tmonth1.getText().isEmpty()||tyear1.getText().isEmpty()||tday2.getText().isEmpty()||tmonth2.getText().isEmpty()||tday1.getText().isEmpty()||tyear2.getText().isEmpty()||tnl1.getText().isEmpty()||tnl2.getText().isEmpty()||tl1.getText().isEmpty()||tl2.getText().isEmpty()){
            AlertMaker.showNotification("خطأ", "من فضلك قم بملئ البيانات", AlertMaker.image_warning);
            }
            else{
        Parent part = FXMLLoader.load(getClass().getResource("/firstBook/FirstBook.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();}
            }
        catch(IOException e){
        e.printStackTrace();
            
        }
        
    }
}  

