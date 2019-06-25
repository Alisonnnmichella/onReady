import Modelo.Concesionaria;

public class MainTest {
    public static void main(String args[]) {
         Concesionaria concesionaria=new Concesionaria();
         concesionaria.mostrarAutos();
         System.out.println("==============================");
         concesionaria.mostrarVehiculoMenosEconomico();
         concesionaria.mostrarVehiculoMasEconomico();
         concesionaria.mostrarVehiculoConLetraYEnElModelo();
         System.out.println("==============================");
         concesionaria.mostrarVehiculosDeMayorAMenor();
    }
}