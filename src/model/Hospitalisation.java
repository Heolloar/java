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
public class Hospitalisation {
    private int num_malade;
    private String code_service;
    private int num_chambre;
    private int num_lit;
    
    Hospitalisation(int num_malade,String code_service,int num_chambre,int num_lit )
    {
       this.num_malade=num_malade;
       this.code_service=code_service;
       this.num_chambre=num_chambre;
       this.num_lit=num_lit;  
    }
    
    
}
