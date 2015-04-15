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
public class Docteur extends Employe {
    private String specialite;
    
    
    public Docteur(int num,String nom,String prenom,String adresse,String num_tel,
            String specialite){
        super(num,nom,prenom,num_tel,adresse);
        this.specialite=specialite;
    }
    
    
}
