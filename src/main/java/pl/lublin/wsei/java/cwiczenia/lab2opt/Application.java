package pl.lublin.wsei.java.cwiczenia.lab2opt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 470);
        stage.setResizable(false);
        stage.setTitle("Rysowanie sinusoidy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}