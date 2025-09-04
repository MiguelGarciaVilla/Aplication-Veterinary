package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Mascota {
    private String codigo;
    private String nombre;
    private String especie;
    private String  raza;
    private int edad;
    private String  color;
    private double peso;
    private Propietario  propietario;
    private ArrayList<Cita> citas;


    public Mascota(String codigo, String nombre, String especie, String raza, int edad, String color, double peso, Propietario propietario, ArrayList<Cita> citas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.propietario = propietario;
        this.citas = citas;
    }

    @Override
    public String toString() {

            return "\ncodigo: " + codigo + ", nombre: " + nombre + ", especie: "+especie+", raza: "+
                    raza+", edad: " + edad + ", color: "+color+", peso: "+peso;



    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
