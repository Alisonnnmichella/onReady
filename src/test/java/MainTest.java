import Modelo.Concesionaria;

public class MainTest {
    public static void main(String args[]) {
         Concesionaria concesionaria=new Concesionaria();
         concesionaria.mostrarAutos();
        concesionaria.mostrarVehiculoMasEconomico();
        concesionaria.mostrarVehiculoMenosEconomico();
        concesionaria.mostrarVehiculoConLetraYEnElModelo();

    }
}