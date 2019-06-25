import Modelo.Concesionaria;

public class MainTest {
    public static void main(String args[]) {
         Concesionaria concesionaria=new Concesionaria();
            concesionaria.mostrarVehiculos();
         System.out.println("==========");
        concesionaria.mostrarVehiculoMarCaro();
        concesionaria.mostrarVehiculoMasBarato();
        concesionaria.mostrarVehiculoQueContienenLetra("Y");
        System.out.println("==========");
        concesionaria.mostrarVehiculosConPreciosDescendentemente();

    }
}