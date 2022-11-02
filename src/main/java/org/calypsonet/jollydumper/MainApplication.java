package org.calypsonet.jollydumper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MainApplication extends Application {
    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);
    @Override
    public void init() throws Exception {
        super.init();
        logger.info("Application initialization.");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), -1, -1);
        stage.setTitle("Calypso Jolly Dumper");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        logger.info("Application shutdown.");
    }

    public static void main(String[] args) {
        launch();
    }
}