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
public class Malade {
    private int num;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String mutuelle;
    
    public Malade(int num,String nom,String prenom,String adresse,
            String tel, String mutuelle)
    {
        this.num=num;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.mutuelle=mutuelle;
        this.tel=tel;
    }
    
    
    
}
