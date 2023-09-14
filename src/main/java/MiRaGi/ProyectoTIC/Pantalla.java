package MiRaGi.ProyectoTIC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

public class Pantalla extends Application {
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource());
        fxmlLoader.setControllerFactory();
        root = fxmlLoader.load();

        primaryStage.setScene(new javafx.scene.Scene(root));
        primaryStage.show();


    }
}
