/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Compte {
    
    private int numeroCompte;
    private double soldCourant;
    private String dateCreation;
    private String nomClient;
    private ArrayList <Mouvement> mouvements;

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSoldCourant() {
        return soldCourant;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getNomClient() {
        return nomClient;
    }

    public ArrayList getMouvements() {
        return mouvements;
    }

    public void setMouvements(ArrayList mouvements) {
        this.mouvements = mouvements;
    }
        

    public Compte(int numeroCompte, double soldCourant, String dateCreation, String nomClient) {
        this.numeroCompte = numeroCompte;
        this.soldCourant = soldCourant;
        this.dateCreation = dateCreation;
        this.nomClient = nomClient;
    }
    
    
    
    
    
    
}
