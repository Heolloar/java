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
public class Service {
    private String code_service;
    private String nom;
    private String batiment;
    private int num_dir;
    
    public Service (String code_service,String nom,String batiment,int num_dir)
    {
        this.code_service=code_service;
        this.nom=nom;
        this.batiment=batiment;
        this.num_dir=num_dir;
    }
    
}
