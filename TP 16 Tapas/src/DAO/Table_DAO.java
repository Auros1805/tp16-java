/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author quent
 */
public class Table_DAO 
{
    private int idTable;
    
    private int nbPersonne;
    
    public Table_DAO(int idTable, int nbPersonne)
    {
        this.idTable = idTable;
        this.nbPersonne = nbPersonne;
    }
    
    public int getIdTable() {
        return idTable;
    }
    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }
    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

}
