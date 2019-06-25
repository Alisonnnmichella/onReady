package Modelo;

public class Automovil extends Vehiculo {
    int cantidadDePuertas;

    public Automovil(String marca, String modelo,int cantidadDePuertas, Double precio) {
        super(marca, modelo, precio);
        this.cantidadDePuertas=cantidadDePuertas;
    }
    public String presentarCaracteristicaVehiculo(){
        return "Puertas: "+cantidadDePuertas;
    }
}
