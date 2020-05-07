/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.TP16Tapas;

public class Switcher {
    private static Stage stage;

    public static void setApplication(Stage stage) {
        Switcher.stage = stage;
    }
    
    public static void changePage(String pageName)
    {
        if("FXMLDocument.fxml".equals(pageName))
        {
            pageName = "/application/FXMLDocument.fxml";
        }
        else
        {
            pageName = "/" + pageName + "/" + pageName + ".fxml";
        }
        try 
        {
            FXMLLoader fxmlLoader = new FXMLLoader(Switcher.class.getResource(pageName));
            Parent root = (Parent) fxmlLoader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
