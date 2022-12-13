package alert;

import java.io.PrintWriter;
import java.io.StringWriter;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class AlertMaker {
    public static final Image image_checked=new Image("image/checked.png");
    public static final Image image_cross=new Image("image/cross.png");
    public static final Image image_download=new Image("image/download.png");
    public static final Image image_warning=new Image("image/warning.png");
    public static final Image image_warning2=new Image("image/warning2.png");
    public static final Image image_movie_forbidden=new Image("image/forbidden.png");
    public static final Image image_link=new Image("image/link.png");
    public static final Image image_password_key=new Image("image/key.png");
    public static void showSimpleAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    public static void showWarning(Exception ex) {
        Image img=image_movie_forbidden;
        Notifications notify=Notifications.create()
                        .darkStyle()
                        .graphic(new ImageView(img))
                        .title(ex.getClass().getName())
                        .text(ex.getMessage())
                        .position(Pos.TOP_CENTER)
                        .hideAfter(Duration.seconds(5));
                notify.show();
    }
    public static void showWarning(String Title,String Message,Exception ex)
    {
        Image img=image_movie_forbidden;
        Notifications notify=Notifications.create()
                        .darkStyle()
                        .graphic(new ImageView(img))
                        .title(Title)
                        .text(Message+ex.getMessage())
                        .position(Pos.TOP_CENTER)
                        .hideAfter(Duration.seconds(5));
                notify.show();
    }
    public static void showErrorMessage(String title, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void showErrorMessage(Exception ex) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error occured");
        alert.setHeaderText("Error Occured");
        alert.setContentText(ex.getLocalizedMessage());
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("The exception stacktrace was:");

        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        alert.getDialogPane().setExpandableContent(expContent);
        alert.showAndWait();
    }
    
     public static void showErrorMessage(Exception ex, String title, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error occured");
        alert.setHeaderText(title);
        alert.setContentText(content);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("The exception stacktrace was:");

        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        alert.getDialogPane().setExpandableContent(expContent);
        alert.showAndWait();
    }
     public static void showNotification(String Title,String Message,Image img)
     {
                Notifications notify=Notifications.create()
                        .darkStyle()
                        .graphic(new ImageView(img))
                        .title(Title)
                        .text(Message)
                        .position(Pos.TOP_CENTER)
                        .hideAfter(Duration.seconds(5));
                notify.show();
     }
}

