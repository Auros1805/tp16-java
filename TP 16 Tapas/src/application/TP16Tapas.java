/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Class.Session.*;
import Class.Switcher;
import static Class.Switcher.*;
/**
 *
 * @author denis
 */
public class TP16Tapas extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Switcher.setApplication(stage);
        Switcher.changePage("FXMLDocument.fxml");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
