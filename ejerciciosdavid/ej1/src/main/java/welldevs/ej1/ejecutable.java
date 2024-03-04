/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package welldevs.ej1;

/**
 *
 * @author admin
 */
public class ejecutable {
    
    public static void main(String[] args) {
        Ej1 p1 = new Ej1(123.3, 233.4, 3435.23, 34523.2,1, "Saturno");
        System.out.println("Massa de "+ p1.getNombre()+":"+p1.getMasa());
        System.out.println("Densitat de "+ p1.getNombre()+":"+p1.getDensidad());
        System.out.println("Diametre de "+ p1.getNombre()+":"+p1.getDiametro());
        System.out.println("Distancia fins el Sol de "+ p1.getNombre()+":"+p1.getDistanciasol());
        System.out.println("Nùmero identificatiu de "+ p1.getNombre()+":"+p1.getId());
    }
}
