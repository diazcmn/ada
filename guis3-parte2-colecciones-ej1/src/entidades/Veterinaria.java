/*1- Diseñar un programa que lea y guarde mascotas para una Veterinaria, el ArrayList tiene que ser de tipo Mascota.
El programa pedirá una mascota, donde especificaremos que es, su edad y su nombre, lo mismo se guardará en la lista
y después se le preguntará al usuario si quiere guardar otra mascota o si quiere salir.
📌 Si decide salir:
• Se mostrará todos las mascotas guardados en la lista.
• Se les mostrara las mascotas consideradas como mas viejitas, que son mayores a 6 años.
• Se les mostrara las que son mas pequeñas, menores de 5 años.*/

package entidades;

import java.util.ArrayList;

public class Veterinaria {


    private String nombre;
    private int edad;
    private String especie;

    public Veterinaria(){

    }

    public Veterinaria(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
