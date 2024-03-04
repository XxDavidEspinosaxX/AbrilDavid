/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package welldevs.ejercicisabril;

/**
 *
 * @author admin
 */
public class Ejercicisabril {

    public static void main(String[] args) {
        Planetas p1 = new Planetas(123.3, 233.4, 3435.23, 34523.2,1, "Saturno");
        System.out.println("Massa de "+ p1.getNom()+":"+p1.getMassa());
        System.out.println("Densitat de "+ p1.getNom()+":"+p1.getDensitat());
        System.out.println("Diametre de "+ p1.getNom()+":"+p1.getDiametre());
        System.out.println("Distancia fins el Sol de "+ p1.getNom()+":"+p1.getDistanciasol());
        System.out.println("Nùmero identificatiu de "+ p1.getNom()+":"+p1.getNumiden());
    }
}
