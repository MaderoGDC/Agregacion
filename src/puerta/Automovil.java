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
public class Automovil {
    private String marca;
    private int anio;
    private String modelo;
    private Llanta llantas[];
    private Motor motor;
    private Puerta puertas[];

    public Automovil(String marca, int anio, String modelo) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }
    
    
    public Automovil(String marca, int anio, String modelo,Llanta[] llanta,Motor motor,Puerta[] puertas) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.llantas = new Llanta [4];
        this.motor = motor;
        this.puertas = new Puerta [5];
    }

    public String getMarca() {
        return marca;
    }

    public int getanio() {
        return anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void DestructorLlantas(){
    this.llantas = null;
    }
    
}
