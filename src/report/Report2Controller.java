/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package report;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class Report2Controller extends ReportController implements Initializable {

    @FXML
    private Pane p;
    @FXML
    private Label Estdlal;
    @FXML
    private Label m3lomat;
    @FXML
    private Label Total;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DegreeCount score = new DegreeCount();
        Estdlal.setText(String.valueOf(score.firstOne()-2));
    
int e1=Integer.parseInt(Estdlal.getText());
        System.out.println("value of Estdlal= " +e1);
        
        m3lomat.setText(String.valueOf(score.firstTwo()-2));
int jl=Integer.parseInt(m3lomat.getText());
        System.out.println("total of label10= " +jl);
        
        int Totall= e1+jl;
        System.out.println("Total value is = "+Totall);
        
        Total.setText(String.valueOf(Totall));
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
        Parent part = FXMLLoader.load(getClass().getResource("/report/Report3.fxml"));
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
