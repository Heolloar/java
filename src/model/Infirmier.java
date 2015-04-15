/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author clairet
 */
public class Infirmier extends Employe {
    private String code_service;
    private String rotation;
    private int salaire;

    public Infirmier(int num, String nom, String prenom, String adresse, String num_tel,
            String code_service,String rotation,int salaire) 
    {
        super(num, nom, prenom, num_tel, adresse);
        this.code_service=code_service;
        this.rotation=rotation;
        this.salaire=salaire;
              
    }
    
    

    
    
}