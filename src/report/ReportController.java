/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package report;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ReportController implements Initializable{

    @FXML
    private Label name;
    @FXML
    private Label gender;
    @FXML
    private Label cardNum;
    @FXML
    private Label classNum;
    @FXML
    private Label fahesName;
    @FXML
    private Label school;
     @FXML
    private Label c10;
    @FXML
    private Label c11;
    @FXML
    private Label c13;
    @FXML
    private Label c12;
    @FXML
    private Label c1;
    @FXML
    private Label c4;
    @FXML
    private Label c7;
    @FXML
    private Label c2;
    @FXML
    private Label c3;
    @FXML
    private Label c6;
    @FXML
    private Label c5;
    @FXML
    private Label c8;
    @FXML
    private Label c9;
    //define static var
    public static Label static_name;
    public static Label static_gender;
    public static Label static_card;
    public static Label static_class;
    public static Label static_fahes;
    public static Label static_scholl;
    public static Label static_c1;
    public static Label static_c2;
    public static Label static_c3;
    public static Label static_c4;
    public static Label static_c5;
    public static Label static_c6;
    public static Label static_c7;
    public static Label static_c8;
    public static Label static_c9;
    public static Label static_c10;
    public static Label static_c11;
    public static Label static_c12;
    public static Label static_c13;
   
//end
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set var in labels
     name.setText(static_name.getText());
     gender.setText(static_gender.getText());
     cardNum.setText(static_card.getText());
     classNum.setText(static_class.getText());
     fahesName.setText(static_fahes.getText());
     school.setText(static_scholl.getText());
     
     c1.setText(static_c1.getText());
     c2.setText(static_c2.getText());
     c3.setText(static_c3.getText());
     c4.setText(static_c4.getText());
     c5.setText(static_c5.getText());
     c6.setText(static_c6.getText());
     c7.setText(static_c7.getText());
     c8.setText(static_c8.getText());
     c9.setText(static_c9.getText());
     c10.setText(static_c10.getText());
     c11.setText(static_c11.getText());
     c12.setText(static_c12.getText());
     c13.setText(static_c13.getText());
    }    
 
}
