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
public class Banco {
    
    public static void ExtractosBancarios (Banque banco){
        System.out.println("Info cuentas");
        System.out.println(banco.getComptes());
        System.out.println(banco.getTypes());
    }
    
    
    public static void main(String[] args) {
        Compte cuenta1 = new Compte(1000,5000000,"26-09-17","Paola Barrera");
        Compte cuenta2 = new Compte(1300,1500000,"20-09-17","Steven Bohorquez");
        ArrayList cuentas = new ArrayList();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        
        Type tranc1 = new Type ("Consignación");
        Type tranc2 = new Type ("Transacción");
        ArrayList types = new ArrayList();
        types.add(tranc1);
        types.add(tranc2);
        
        Banque banco = new Banque("1234",types,cuentas);
        
        Mouvement mov1 = new Mouvement("03-06-17",5000000,2500000);
        Mouvement mov2 = new Mouvement("05-06-17",2500000,6000000);
        ArrayList movs1 = new ArrayList();
        movs1.add(mov1);
        movs1.add(mov2);
        
        cuenta1.setMouvements(movs1);
        
        Mouvement mov3 = new Mouvement("03-05-17",5000000,2500000);
        Mouvement mov4 = new Mouvement("05-07-17",2500000,6000000);
        ArrayList movs2 = new ArrayList();
        movs2.add(mov3);
        movs2.add(mov4);
        
        cuenta2.setMouvements(movs2);
        
        ExtractosBancarios (banco);
        
    }
    
}
