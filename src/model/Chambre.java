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
public class Chambre {
    private int num_chambre;
    private String code_service;
    private int num_surv;
    private int nb_lit;
    
    public Chambre(String code_service,int num_chambre,int num_surv,int nb_lit)
    {
        this.code_service=code_service;
        this.nb_lit=nb_lit;
        this.num_chambre=num_chambre;
        this.num_surv=num_surv;
    }
    
}
