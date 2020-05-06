/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.Session;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tp.pkg16.tapas.TP16Tapas;

public class Switcher {
    private static Stage application;

    public static void setApplication(Stage application) {
        Switcher.application = application;
    }
    
    public static String switchPageMain()
    {
        String page = "Page_"+Session.getPage()+"/FXMLPAGE_"+Session.getPage()+".fxml";
        if(Session.getPage()==0)
        {
            page = "FXMLDocument.fxml";
        }
        return page;
    }
    
    public static void  switchPage(int numPage)
    {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader();
            root = loader.getResource("Page_"+numPage+"/FXMLPAGE_"+numPage+".fxml");
        } catch (IOException ex) {
            Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        application.setScene(scene);
    }
}
