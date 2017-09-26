/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Banque {
    
    private String code;
    private ArrayList <Type> types;
    private ArrayList <Compte> comptes;

    public String getCode() {
        return code;
    }

    public ArrayList getTypes() {
        return types;
    }

    public ArrayList getComptes() {
        return comptes;
    }
    
    public Banque(String code, ArrayList types, ArrayList comptes) {
        this.code = code;
        this.types = types;
        this.comptes = comptes;
    }

    

    
    
    
    
}
