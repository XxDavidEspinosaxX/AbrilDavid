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

    private double massa;
    private double densitat;
    private double diametre;
    private double distanciasol;
    private int numiden;
    private String nom;
    
     public Planetas(double massa, double densitat, double diametre, double distanciasol, int numiden, String nom) {
        
        this.massa = massa;
        this.densitat= densitat;
        this.diametre = diametre;
        this.distanciasol = distanciasol;
        this.numiden = numiden;
        this.nom = nom;
    }
    
     
     public double getMassa() {
        return massa;
    }

    public double getDensitat() {
        return densitat;
    }

    public double getDiametre() {
        return diametre;
    }
    public double getDistanciasol() {
        return distanciasol;
    }

    public int getNumiden() {
        return numiden;
    }

    public String getNom() {
        return nom;
        }
}
