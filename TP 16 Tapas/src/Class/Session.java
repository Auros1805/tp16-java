/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author denis
 */
public class Session {
    public static int _page = 0;
    public static int _nbpersonne = 0;

    public static int getNbpersonne() {
        return _nbpersonne;
    }

    public static void setNbpersonne(int _nbpersonne) {
        Session._nbpersonne = _nbpersonne;
    }

    public static int getPage() {
        return _page;
    }

    public static void setPage(int _page) {
        Session._page = _page;
    }
    
}
