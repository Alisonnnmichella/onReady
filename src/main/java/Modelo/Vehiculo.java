package Modelo;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Double precio;

    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public abstract String presentarCaracteristicaVehiculo();

    public String presentarse(){
        return "Marca:"+marca+" // "+"Modelo: "+modelo+" // "+presentarCaracteristicaVehiculo()+" // "+"Precio: "+precio;
    };

}
