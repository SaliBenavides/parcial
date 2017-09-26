/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Mouvement {
    
    private String date;
    private double soldePrecedent;
    private double montant;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSoldePrecedent() {
        return soldePrecedent;
    }

    public void setSoldePrecedent(double soldePrecedent) {
        this.soldePrecedent = soldePrecedent;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Mouvement(String date, double soldePrecedent, double montant) {
        this.date = date;
        this.soldePrecedent = soldePrecedent;
        this.montant = montant;
    }

    
    
    
}
