/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package report;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
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
    private JFXTextField tday3;
    @FXML
    private JFXTextField tmonth3;
    @FXML
    private JFXTextField tyear3;
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
public String day1;
public String day2;
public String day3;
public String month1;
public String month2;
public String month3;
public String year1;
public String year2;
public String year3;
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
       day1=tday1.getText();
       day2=tday2.getText();
       day3=tday3.getText();
       month1=tmonth1.getText();
       month2=tmonth2.getText();
       month3=tmonth3.getText();
       year1=tyear1.getText();
       year2=tyear2.getText();
       year3=tyear3.getText();
       nl1=tnl1.getText();
       nl2=tnl2.getText();
       l1=tl1.getText();
       l2=tl2.getText();
       //end
       
       //set data in other controller
       static_name=new Label(tgName);
       static_fahes=new Label(tgFahes);
       static_scholl=new Label(tgSchool);
       static_gender=new Label(tgGenders);
       static_card=new Label(tgCard);
       static_class=new Label(tgClass);
       
       static_c1=new Label(day1);
       static_c2=new Label(month1);
       static_c3=new Label(year1);
       static_c4=new Label(day2);
       static_c5=new Label(month2);
       static_c6=new Label(year2);
       static_c7=new Label(day3);
       static_c8=new Label(month3);
       static_c9=new Label(year3);
       static_c10=new Label(nl1);
       static_c11=new Label(nl2);
       static_c12=new Label(l1);
       static_c13=new Label(l2);

        try {
        Parent part = FXMLLoader.load(getClass().getResource("/report/Report.fxml"));
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

