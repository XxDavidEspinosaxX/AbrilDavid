/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welldevs.ejercicisabril;

/**
 *
 * @author admin
 */
public class Planetas {

    private float massa;
    private float densitat;
    private float diametre;
    private float distanciasol;
    private int numiden;
    private String nom;
    
     public Planetas(float massa, float densitat, float diametre, float distanciasol, int numiden, String nom) {
        
        this.massa = massa;
        this.densitat= densitat;
        this.diametre = diametre;
        this.distanciasol = distanciasol;
        this.numiden = numiden;
        this.nom = nom;
    }
    
     
     public float getMassa() {
        return massa;
    }

    public float getDensitat() {
        return densitat;
    }

    public float getDiametre() {
        return diametre;
    }
    public float getDistanciasol() {
        return distanciasol;
    }

    public int getNumiden() {
        return numiden;
    }

    public String getNom() {
        return nom;
        }
}
