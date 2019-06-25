package Modelo;

public abstract class Vehiculo implements Comparable<Vehiculo>{
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

    public void presentarse(){
        System.out.println("Marca:"+marca+" // "+"Modelo: "+modelo+" // "+presentarCaracteristicaVehiculo()+" // "+"Precio: "+precio);
    }

    @Override
    public int compareTo(Vehiculo otherVehiculo){
        return Double.compare(otherVehiculo.getPrecio(),this.getPrecio());
    }
    public String toStringMarcaYModelo(){
        return marca+" "+ modelo;
    }

}
