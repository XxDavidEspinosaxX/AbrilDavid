/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package welldevs.ej1;

/**
 *
 * @author admin
 */
public class Ej1 {

    private double masa;
    private double diametro;
    private double densidad;
    private double distanciasol;
    private int id;
    private String nombre;
    
        public Ej1 (double masa, double diametro, double densidad, double distanciasol, int id, String nombre) {
            this.masa = masa;
            this.diametro = diametro;
            this.densidad = densidad;
            this.distanciasol = distanciasol;
            this.id = id;
            this.nombre = nombre;
            
    }
        
        public double getMasa(){
            return masa;
        }
        
        public double getDiametro(){
            return diametro;
        }
        
        public double getDensidad(){
            return densidad;
        }
        
        public double getDistanciasol(){
            return distanciasol;
        }
        
        public int getId(){
            return id;
        }
        
        public String getNombre(){
            return nombre;
        }
}
