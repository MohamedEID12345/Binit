
package Login;

import alert.AlertMaker;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {

    @FXML
    private ImageView exit;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton loginn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void exit(MouseEvent event) {
       Platform.exit();
    }

    @FXML
    private void login(MouseEvent event) throws IOException {
        if("root".equals(username.getText())&&"root".equals(password.getText())){
        Parent part = FXMLLoader.load(getClass().getResource("/choose/Choose.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        AlertMaker.showNotification("", "تم التسجيل بنجاح", AlertMaker.image_checked);
        }
        else if(username.getText().isEmpty()||password.getText().isEmpty()){
            AlertMaker.showNotification("خطأ", "من فضلك قم بملئ البيانات", AlertMaker.image_warning);

        }
        else {
            if("root"!=username.getText()&&"root"!=password.getText()){
                AlertMaker.showNotification("خطأ", "من فضلك تأكد من إسم المستخدم أو الباسوورد", AlertMaker.image_warning);
            }
        }
    }
        }
    
    
