/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author denis
 */
public class Commande_DAO 
{
    private int idCommande;
    
    private int numCommande;
    
    private int nbTapas;
    
    public Commande_DAO(int idCommande, int numCommande, int nbTapas)
    {
        this.idCommande = idCommande;
        this.numCommande = numCommande;
        this.nbTapas = nbTapas;
    }
    
    public int getIdCommande()
    {
        return idCommande;
    }
    public void setIdCommande()
    {
        this.idCommande = idCommande;
    }
    
    public int getNumCommande() {
        return numCommande;
    }
    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public int getNbTapas() {
        return nbTapas;
    }
    public void setNbTapas(int nbTapas) {
        this.nbTapas = nbTapas;
    }
}
