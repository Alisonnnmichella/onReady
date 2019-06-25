package Modelo;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
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
    public double menorPrecioDeVehiculos(){
        OptionalDouble minimo=vehiculos.stream().mapToDouble(vehiculo->vehiculo.getPrecio()).min();
        if(minimo==null)
            throw new RuntimeException("No se pudo encontrar el menor precio de un vehiculo");
        return minimo.getAsDouble();
    }
    private Vehiculo getVehiculoMasEconomico(){
        return vehiculos.stream().filter(vehiculo -> vehiculo.getPrecio()==menorPrecioDeVehiculos())
                .collect(Collectors.toList()).get(0);
    }
    public void mostrarVehiculoMasEconomico() {
        Vehiculo vehiculoMasEconomico=getVehiculoMasEconomico();
        System.out.println("Vehiculo mas barato: "+vehiculoMasEconomico.getMarca()+" "+vehiculoMasEconomico.getModelo());
    }
    public double mayorPrecioDeVehiculos(){
        OptionalDouble mayor=vehiculos.stream().mapToDouble(vehiculo->vehiculo.getPrecio()).max();
        if(mayor==null)
            throw new RuntimeException("No se pudo encontrar el menor precio de un vehiculo");
        return mayor.getAsDouble();
    }
    private Vehiculo getVehiculoMenosEconomico(){
      return vehiculos.stream().filter(vehiculo -> vehiculo.getPrecio()==mayorPrecioDeVehiculos())
                .collect(Collectors.toList()).get(0);
    }
    public void mostrarVehiculoMenosEconomico() {
        Vehiculo vehiculoMasCaro=getVehiculoMenosEconomico();
        System.out.println("Vehiculo mas caro: "+marcaYModeloDelVehiculo(vehiculoMasCaro));
    }

    public void mostrarVehiculoConLetraYEnElModelo(){
        Vehiculo vehiculoConY= vehiculos.stream().
                filter(vehiculo -> vehiculo.getModelo().contains("Y"))
                .collect(Collectors.toList()).get(0);
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+marcaYModeloDelVehiculo(vehiculoConY)+" "+vehiculoConY.getPrecio());
    }
    private String marcaYModeloDelVehiculo(Vehiculo vehiculo){
        return vehiculo.getMarca()+" "+vehiculo.getModelo();
    }
    public void mostrarAutos(){
        vehiculos.forEach(vehiculo -> System.out.println(vehiculo.presentarse()));
    }
    public void mostrarVehiculosDeMayorAMenor() {
        LinkedList vehiculosOrdenados= new LinkedList<>();
        List<Vehiculo> vehiculosPibote=new ArrayList<>();
        vehiculos.forEach(vehiculo -> vehiculosPibote.add(vehiculo));
        vehiculosPibote.remove(getVehiculoMenosEconomico());
        vehiculosOrdenados.add(getVehiculoMenosEconomico());
        for(int i=0;i<vehiculos.size()-1;i++){
            Vehiculo vehiculoMasCaro=vehiculosPibote.get(0);
            for(int j=0;j<vehiculosPibote.size();j++){
                if((vehiculoMasCaro.getPrecio()<vehiculosPibote.get(j).getPrecio())){
                    vehiculoMasCaro=vehiculosPibote.get(j);
                }
            }
            vehiculosOrdenados.add(vehiculoMasCaro);
            vehiculosPibote.remove(vehiculoMasCaro);
        }


    }

}
