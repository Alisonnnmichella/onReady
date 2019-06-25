package Modelo;

import java.util.*;
import java.util.stream.Collectors;

public class Concesionaria {
    LinkedList<Vehiculo> vehiculos;

    public Concesionaria(){
        vehiculos=new LinkedList<>();
        cargarVehiculos();
    }
    public void cargarVehiculos(){
        vehiculos.add(new Automovil("Peugeot","206",4,200000.00));
        vehiculos.add(new Moto("Honda","Titan",125,60000.00));
        vehiculos.add(new Automovil("Peugeot","208",5,250000.00));
        vehiculos.add(new Moto("Yamaha","YBR",160,80500.50));
    }
    public List<Vehiculo> listaOrdenadaDeMayorAMenor(){
        List<Vehiculo> vehiculosDeMayorAMenorPrecio=new ArrayList<>();
        vehiculos.forEach(vehiculo -> vehiculosDeMayorAMenorPrecio.add(vehiculo));
        Collections.sort(vehiculosDeMayorAMenorPrecio);
        return vehiculosDeMayorAMenorPrecio;
    }
    public void mostrarVehiculos(){
        vehiculos.forEach(vehiculo -> vehiculo.presentarse());
    }
    public void mostrarVehiculoMarCaro(){
        System.out.println("Vehículo más barato: "+listaOrdenadaDeMayorAMenor().get(0).toStringMarcaYModelo());
    }
    public void mostrarVehiculoMasBarato(){
        System.out.println("Vehículo más caro: "+listaOrdenadaDeMayorAMenor().get(vehiculos.size()-1).toStringMarcaYModelo());
    }
    public void mostrarVehiculoQueContienenLetra(String letra){
        System.out.println("Vehiculo que contiene en el modelo la letra "+letra+" "+vehiculos.stream().filter(vehiculo -> vehiculo.getMarca().contains(letra))
        .collect(Collectors.toList()).get(0).toStringMarcaYModelo());
    }
    public void mostrarVehiculosConPreciosDescendentemente(){
        listaOrdenadaDeMayorAMenor().forEach(vehiculo -> vehiculo.presentarse());
    }

}

