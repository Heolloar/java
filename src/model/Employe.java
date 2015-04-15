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
public  class Employe {
   private int num; 
   private String nom;
   private String prenom;
   private String num_tel;
   private String adresse;
   
   public Employe(int num,String nom,String prenom,String adresse,String num_tel)
   {
       this.nom=nom;
       this.prenom=prenom;
       this.num_tel=num_tel;
       this.adresse=adresse;
   }
   
  
   }
