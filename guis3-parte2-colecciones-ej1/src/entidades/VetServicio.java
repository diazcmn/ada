package entidades;


import java.util.ArrayList;
import java.util.Scanner;

public class VetServicio {

    private ArrayList<Veterinaria> listaMacota;

    public VetServicio() {
        this.listaMacota = new ArrayList<>();
    }

    public Veterinaria ingresarMascota(String nombre, int edad, String especie) {
        Veterinaria mascota = new Veterinaria(nombre, edad, especie);
        return mascota;
    }

    public ArrayList<Veterinaria> registrarMascota(){
        System.out.println("Ingreser: ");
        Scanner input = new Scanner(System.in);
        String end="";


     do {
        System.out.println("Ingresar nombre");
        String nombre= input.next();

        System.out.println("Ingresar edad");
        int edad = input.nextInt();

         System.out.println("Ingresar tipo");
         String especie = input.next();

        listaMacota.add(ingresarMascota(nombre, edad, especie));
        System.out.println("Si desea ingresar otra mascota, Presione S, de lo contrario cualquier tecla para salir.");
        end = input.next();
    } while (end.equalsIgnoreCase("s"));
        return listaMacota;
}

    public void verListaMascotas() {
        for (Veterinaria i : listaMacota) {
            System.out.println(i);
        }
    }

    public void mascotasViejas() {
        for (Veterinaria i : listaMacota) {
            if (i.getEdad() >= 6) {
                System.out.println(i);
            }

        }
    }

    public void mascotasJovenes() {
        for (Veterinaria i : listaMacota) {
            if (i.getEdad() < 5) {
                System.out.println(i);
            }

        }
    }


    //me saltaba un error que solo se iba si ponia este constructor/metodo vacio aca, no entiendo eso

    public void ingresarMascota() {
    }
}


