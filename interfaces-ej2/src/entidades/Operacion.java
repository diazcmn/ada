/*EJERCICIO 2 DE INTERFACE

Crearemos una Interface llamada Operacion, con un metodo Saludar(); y otro llamado TipoOperacion(); donde diremos la operacion a quien hacemos referencia.

Crearemos una Interface llamada Suma,
donde tendra dos metodos, el primero heredado de Operacion, y el segundo que se llame Operacion(); que al implementarlo podamos hacer una mini suma

Creamos la clase ImpOperacion, donde implementaremos Operacion, Suma y sobreescribiremos todos los metodos que tengamos, segun su requisito.

En el main instanciamos la clase ImpOperacion y con nuestro objeto invocamos todos los metodos creados.*/

/*EJERCICIO INTERFACE lll

Creamos la interface llamado Vehiculo
Dentro tendra la velocidad, color y patente.

Despues crearemos dos interfaces mas Auto y Moto, quienes extenderan los metodos de Vehiculo

La interface Auto tendra un metodo llamado Marca;
La interface Moto tendra un metodo llamado MarcaCubierta;

Y crearemos la clase ImpVehiculo donde implementaremos Auto y Moto, sobreescribiendo todos sus metodos.

En el main, creamos dos objetos de la instancia de ImpVehiculo, *Recuerden que deben llamarse de diferente forma los objetos por ej "objAuto y objMoto"*
Luego, invocaremos todos los metodos implementados en ambos objetos.*/

package entidades;

public interface Operacion {
    public String saludar();
    public String TipoOperacion();

}
