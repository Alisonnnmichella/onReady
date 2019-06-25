package Modelo;

public class Moto extends Vehiculo{
    int cilindrada;

    public Moto(String marca, String modelo,int cilindrada, Double precio) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }
    public String getCaracteristica(){
        return "Cilindrada: ";
    }

    public String presentarCaracteristicaVehiculo(){
        return "Cilindrada: "+cilindrada+"c";
    }
}
