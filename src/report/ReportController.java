/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package report;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;
import secondBook.Code.DraggableMaker;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ReportController implements Initializable{
DraggableMaker make = new DraggableMaker();
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
   int oday=0;
   int omonth=0;
   int oyear=0;
    @FXML
    private Pane p;
    @FXML
    private Label SMOne;
    @FXML
    private Label SMTwo;
    @FXML
    private Label SMThree;
    @FXML
    private Label SMFour;
    @FXML
    private Label SMFive;
    @FXML
    private Label SEOne;
    @FXML
    private Label SETwo;
    @FXML
    private Label SEThree;
    @FXML
    private Label SEFour;
    @FXML
    private Label SE5;
    @FXML
    private Label SMO2;
    @FXML
    private Label SMO3;
    @FXML
    private Label SMO4;
    @FXML
    private Label SMO5;
    @FXML
    private Label SMO6;
    @FXML
    private Label SZ2;
    @FXML
    private Label SZ3;
    @FXML
    private Label SZ4;
    @FXML
    private Label SZ5;
    @FXML
    private Label SZ6;
    @FXML
    private Label SMO1;
    @FXML
    private Label SZ1;
    @FXML
    private Label FEOne;
    @FXML
    private Label SMTotal;
    @FXML
    private Label SETotal;
    @FXML
    private Label SMOTotal;
    @FXML
    private Label SZTotal;
    @FXML
    private Label TET2;
    @FXML
    private Label TET3;
    @FXML
    private Label TET4;
    @FXML
    private Label TET5;
    @FXML
    private Label TEK2;
    @FXML
    private Label TEK3;
    @FXML
    private Label TEK4;
    @FXML
    private Label TEK5;
    @FXML
    private Label TMO1;
    @FXML
    private Label TMO2;
    @FXML
    private Label TMO3;
    @FXML
    private Label TMO4;
    @FXML
    private Label TMO5;
    @FXML
    private Label TZ1;
    @FXML
    private Label TZ2;
    @FXML
    private Label TZ3;
    @FXML
    private Label TZ4;
    @FXML
    private Label TZ5;
    @FXML
    private Label TMTotal;
    @FXML
    private Label TETTotal;
    @FXML
    private Label TEKTotal;
    @FXML
    private Label TMOTotal;
    @FXML
    private Label TZTotal;
    @FXML
    private Label TEK1;
    @FXML
    private Label TET1;
    @FXML
    private Label tableOne;
    @FXML
    private Label tableTwo;
    @FXML
    private Label threeOne;
    @FXML
    private Label threeTwo;
    @FXML
    private Label three12;
    @FXML
    private Label ST2;
    @FXML
    private Label M2;
    @FXML
    private Label SK2;
    @FXML
    private Label Mo2;
    @FXML
    private Label Z2;
    @FXML
    private Label ST1;
    @FXML
    private Label M1;
    @FXML
    private Label SK1;
    @FXML
    private Label Mo1;
    @FXML
    private Label Z1;
//end
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
//make.makeDraggable(p);
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
     
     //equation table
     DegreeCount score = new DegreeCount();
    SMOne.setText(String.valueOf(score.secondM3lomat2()-1));
    SMTwo.setText(String.valueOf(score.secondM3lomat3()-1));
    SMThree.setText(String.valueOf(score.secondM3lomat4()-1));
    SMFour.setText(String.valueOf(score.secondM3lomat5()-1));
    SMFive.setText(String.valueOf(score.secondM3lomat6()-1));
    SMTotal.setText(String.valueOf((score.secondM3lomat2()-2)+(score.secondM3lomat3()-2)
            +(score.secondM3lomat4()-2)+(score.secondM3lomat5()-2)+(score.secondM3lomat6()-2)));
    
    int a=Integer.parseInt(SMTotal.getText());
        System.out.println("total of label1= " +a);
        
    SEOne.setText(String.valueOf(score.secondEstdla2()-1));
    SETwo.setText(String.valueOf(score.secondEstdlal3()-1));
    SEThree.setText(String.valueOf(score.secondEstdlal4()-1));
    SEFour.setText(String.valueOf(score.secondEstdlal5()-1));
    SE5.setText(String.valueOf(score.secondEstdlal6()-1));
    SETotal.setText(String.valueOf((score.secondEstdla2()-2)+(score.secondEstdlal3()-2)
            +(score.secondEstdlal4()-2)+(score.secondEstdlal5()-2)+(score.secondEstdlal6()-2)));
    
    int b=Integer.parseInt(SETotal.getText());
        System.out.println("total of label2= " +b);
    
    SMO1.setText(String.valueOf(score.secondMo3lga()-1));
    SMO2.setText(String.valueOf(score.secondMo3lga2()-1));
    SMO3.setText(String.valueOf(score.secondMo3lga3()-1));
    SMO4.setText(String.valueOf(score.secondMo3lga4()-1));
    SMO5.setText(String.valueOf(score.secondMo3lga5()-1));
    SMO6.setText(String.valueOf(score.secondMo3lga6()-1));
    SMOTotal.setText(String.valueOf((score.secondMo3lga()-2)+(score.secondMo3lga2()-2)+(score.secondMo3lga3()-2)
            +(score.secondMo3lga4()-2)+(score.secondMo3lga5()-2)+(score.secondMo3lga6()-2)));
    
    int c=Integer.parseInt(SMOTotal.getText());
        System.out.println("total of label3= " +c);
        
    SZ2.setText(String.valueOf(score.secondZakera2()-1));
    SZ3.setText(String.valueOf(score.secondZakera3()-1));
    SZ4.setText(String.valueOf(score.secondZakera4()-1));
    SZ5.setText(String.valueOf(score.secondZakera5()-1));
    SZ6.setText(String.valueOf(score.secondZakera6()-1));
    SZ1.setText(String.valueOf(score.secondZakera()-1));
    SZTotal.setText(String.valueOf((score.secondZakera()-2)+(score.secondZakera2()-2)+(score.secondZakera3()-2)
            +(score.secondZakera4()-2)+(score.secondZakera5()-2)+(score.secondZakera6()-2)));
    
   int d=Integer.parseInt(SZTotal.getText());
        System.out.println("total of label4= " +d);
        
    FEOne.setText(String.valueOf(score.firstOne()-1));
    
int e=Integer.parseInt(FEOne.getText());
        System.out.println("total of label5= " +e);
  
        int OneTableTotal=a+b+c+d+e;
        System.out.println("Table Total= "+OneTableTotal);
        tableOne.setText(String.valueOf(OneTableTotal));
        threeOne.setText(String.valueOf(OneTableTotal));
        
//    SZTotal.setText(String.valueOf(score-1));
    TET1.setText(String.valueOf(score.thirdEstdlalTahlili2()-1));
    TET2.setText(String.valueOf(score.thirdEstdlalTahlili3()-1));
    TET3.setText(String.valueOf(score.thirdEstdlalTahlili4()-1));
    TET4.setText(String.valueOf(score.thirdEstdlalTahlili5()-1));
    TET5.setText(String.valueOf(score.thirdEstdlalTahlili6()-1));
    TETTotal.setText(String.valueOf((score.thirdEstdlalTahlili2()-2)+(score.thirdEstdlalTahlili3()-2)
            +(score.thirdEstdlalTahlili4()-2)+(score.thirdEstdlalTahlili5()-2)+(score.thirdEstdlalTahlili6()-2)));
    int f=Integer.parseInt(TETTotal.getText());
        System.out.println("total of label6= " +f);
        
    TEK1.setText(String.valueOf(score.thirdEstdlalKamy2()-1));
    TEK2.setText(String.valueOf(score.thirdEstdlalKamy3()-1));
    TEK3.setText(String.valueOf(score.thirdEstdlalKamy4()-1));
    TEK4.setText(String.valueOf(score.thirdEstdlalKamy5()-1));
    TEK5.setText(String.valueOf(score.thirdEstdlalKamy6()-1));
    TEKTotal.setText(String.valueOf((score.thirdEstdlalKamy2()-2)+(score.thirdEstdlalKamy3()-2)
            +(score.thirdEstdlalKamy4()-2)+(score.thirdEstdlalKamy5()-2)+(score.thirdEstdlalKamy6()-2)));
    int g=Integer.parseInt(TEKTotal.getText());
        System.out.println("total of label7= " +g);
    TMO1.setText(String.valueOf(score.thirdMo3lga2()-1));
    TMO2.setText(String.valueOf(score.thirdMo3lga3()-1));
    TMO3.setText(String.valueOf(score.thirdMo3lga4()-1));
    TMO4.setText(String.valueOf(score.thirdMo3lga5()-1));
    TMO5.setText(String.valueOf(score.thirdMo3lga6()-1));
    TMOTotal.setText(String.valueOf((score.thirdMo3lga2()-2)+(score.thirdMo3lga3()-2)
            +(score.thirdMo3lga4()-2)+(score.thirdMo3lga5()-2)+(score.thirdMo3lga6()-2)));
    int h=Integer.parseInt(TMOTotal.getText());
        System.out.println("total of label8= " +h);
        
    TZ1.setText(String.valueOf(score.thirdZakera2()-1));
    TZ2.setText(String.valueOf(score.thirdZakera3()-1));
    TZ3.setText(String.valueOf(score.thirdZakera4()-1));
    TZ4.setText(String.valueOf(score.thirdZakera5()-1));
    TZ5.setText(String.valueOf(score.thirdZakera6()-1));
   TZTotal.setText(String.valueOf((score.thirdZakera2()-2)+(score.thirdZakera3()-2)
           +(score.thirdZakera4()-2)+(score.thirdZakera5()-2)+(score.thirdZakera6()-2)));
   int i=Integer.parseInt(TZTotal.getText());
        System.out.println("total of label9= " +i);
        
    TMTotal.setText(String.valueOf(score.firstTwo()-1));
int j=Integer.parseInt(TMTotal.getText());
        System.out.println("total of label10= " +j);
        
        int TwoTableTotal= f+g+h+i+j;
        System.out.println("Table Two = "+TwoTableTotal);
        
        tableTwo.setText(String.valueOf(TwoTableTotal));
        threeTwo.setText(String.valueOf(TwoTableTotal));
        three12.setText(String.valueOf(OneTableTotal+TwoTableTotal));
        //M3lomat
        int one=a+j;
        M1.setText(String.valueOf(one));
        M2.setText(String.valueOf(one));
        //Estdlal Tahlili
        int two=e+f;
        ST1.setText(String.valueOf(two));
        ST2.setText(String.valueOf(two));
        //Estdlal Kamy
        int three=b+g;
        SK1.setText(String.valueOf(three));
        SK2.setText(String.valueOf(three));
        //Mo3lga
        int four=c+h;
        Mo1.setText(String.valueOf(four));
        Mo2.setText(String.valueOf(four));
        //Zakera
        int five=d+i;
        Z1.setText(String.valueOf(five));
        Z2.setText(String.valueOf(five));
//SMOne.setText(String.valueOf(1));
//    SMTwo.setText(String.valueOf(2));
//    SMThree.setText(String.valueOf(3));
//    SMFour.setText(String.valueOf(4));
//    SMFive.setText(String.valueOf(5));
//    SMTotal.setText(String.valueOf(6));
//    SEOne.setText(String.valueOf(7));
//    SETwo.setText(String.valueOf(8));
//    SEThree.setText(String.valueOf(9));
//    SEFour.setText(String.valueOf(10));
//    SE5.setText(String.valueOf(11));
//    SETotal.setText(String.valueOf(12));
//    SMO1.setText(String.valueOf(13));
//    SMO2.setText(String.valueOf(14));
//    SMO3.setText(String.valueOf(15));
//    SMO4.setText(String.valueOf(16));
//    SMO5.setText(String.valueOf(17));
//    SMO6.setText(String.valueOf(18));
//    SMOTotal.setText(String.valueOf(19));
//    SZ2.setText(String.valueOf(20));
//    SZ3.setText(String.valueOf(21));
//    SZ4.setText(String.valueOf(22));
//    SZ5.setText(String.valueOf(23));
//    SZ6.setText(String.valueOf(24));
//    SZ1.setText(String.valueOf(25));
//    SZTotal.setText(String.valueOf(26));
//    FEOne.setText(String.valueOf(27));
//
//  
////    SZTotal.setText(String.valueOf(score-1));
//    TET1.setText(String.valueOf(28));
//    TET2.setText(String.valueOf(29));
//    TET3.setText(String.valueOf(30));
//    TET4.setText(String.valueOf(31));
//    TET5.setText(String.valueOf(32));
//    TETTotal.setText(String.valueOf(33));
//    TEK1.setText(String.valueOf(34));
//    TEK2.setText(String.valueOf(35));
//    TEK3.setText(String.valueOf(36));
//    TEK4.setText(String.valueOf(37));
//    TEK5.setText(String.valueOf(38));
//    TEKTotal.setText(String.valueOf(39));
//    TMO1.setText(String.valueOf(40));
//    TMO2.setText(String.valueOf(41));
//    TMO3.setText(String.valueOf(42));
//    TMO4.setText(String.valueOf(43));
//    TMO5.setText(String.valueOf(44));
//    TMOTotal.setText(String.valueOf(45));
//    TZ1.setText(String.valueOf(46));
//    TZ2.setText(String.valueOf(47));
//    TZ3.setText(String.valueOf(48));
//    TZ4.setText(String.valueOf(49));
//    TZ5.setText(String.valueOf(50));
//    TZTotal.setText(String.valueOf(51));
//    TMTotal.setText(String.valueOf(52));
//    
//    
//    
//    
    
    }    

    @FXML
    private void print(MouseEvent event) {
Printer printer = Printer.getDefaultPrinter();
    PageLayout pageLayout = printer.createPageLayout(Paper.A4, 
    PageOrientation.PORTRAIT, Printer.MarginType.HARDWARE_MINIMUM);
    PrinterJob job = PrinterJob.createPrinterJob();
    if (job != null && job.showPrintDialog(p.getScene().getWindow())) {
      boolean success = job.printPage(pageLayout, p);
      if (success) {
        job.endJob();
      }
    }
    }

    @FXML
    private void next(MouseEvent event) {
         try {
        Parent part = FXMLLoader.load(getClass().getResource("/report/Report2.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("E-SBIS-5");
        stage.getIcons().add(new Image("/image/icon.png"));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();}
        catch(IOException e){
            e.printStackTrace();
        }
    }

  
    }
 
 

