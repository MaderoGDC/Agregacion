/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puerta;

/**
 *
 * @author Estudiante
 */


public class Main {
    public static void main(String[] args) {
        Llanta[] llantas = new Llanta [4];
            for (int i = 0; i < llantas.length; i++) {
                llantas [i] =  new Llanta("michelin","titanium",1);

            }
        Puerta[] puertas = new Puerta [5];
            for (int i = 0; i < puertas.length; i++) {
                puertas[1] = new Puerta ("arriba");

            }
        Motor motor = new Motor("serie",0);
        Automovil  a1 = new Automovil("Mazda",2000,"3",llantas,motor,puertas);   
    }
    
}
