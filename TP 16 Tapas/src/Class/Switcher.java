/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.Session;

public class Switcher {
    
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
        Session.setPage(numPage);
    }
}
