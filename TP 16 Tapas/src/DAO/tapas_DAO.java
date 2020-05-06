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
public class tapas_DAO 
{
        private int idTapas;
    
    private String nomTapas;
    
    private float prix;
    
    public tapas_DAO(int idTapas, String nomTapas, float prix)
    {
        this.idTapas = idTapas;
        this.nomTapas = nomTapas;
        this.prix = prix;
    }
    
    public int getIdTapas() {
        return idTapas;
    }
    public void setIdTapas(int idTapas) {
        this.idTapas = idTapas;
    }

    public String getNomTapas() {
        return nomTapas;
    }
    public void setNomTapas(String nomTapas) {
        this.nomTapas = nomTapas;
    }

    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

}
