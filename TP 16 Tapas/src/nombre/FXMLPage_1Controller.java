/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

import Class.Session;
import Class.Switcher;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author denis
 */
public class FXMLPage_1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
        private void addNumber(ActionEvent event) 
        {
            Button source = (Button)event.getSource();
            Session.setNbpersonne(Integer.parseInt(source.getText()));
            System.out.println(Session.getNbpersonne());
            Switcher.changePage("tapas");
        }
    
}
