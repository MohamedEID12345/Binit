package choose;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ChooseController implements Initializable {

    double x, y = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void close(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void book1(MouseEvent event) {
       
    }

    @FXML
    private void book2(MouseEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/FirstBook.fxml"));
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
    private void book3(MouseEvent event) {
         try {
            Parent part = FXMLLoader.load(getClass().getResource("/firstBook/Band_Five/Band_Five.fxml"));
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
    private void book4(MouseEvent event) {
    }

}
