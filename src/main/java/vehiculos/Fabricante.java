package vehiculos;

import entidades.VentaFabrica;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {

    private static final Map<String, VentaFabrica> fabricaVendedora = new HashMap<>();

    private String nombre;
    private Pais pais;

    public Fabricante(){}

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        this.registrarFabrica();
    }

    private void registrarFabrica(){
        Boolean existePais =  fabricaVendedora.containsKey(this.nombre);
        if(!existePais){
            VentaFabrica ventaFabrica = new VentaFabrica(this, 0);
            fabricaVendedora.put(this.nombre, ventaFabrica);
        }
    }

    public void vehiculoVendidoFabrica(){
        VentaFabrica ventaFabrica = fabricaVendedora.get(this.nombre);
        ventaFabrica.incrementarVehiculoVendidoFabrica();
        fabricaVendedora.put(this.nombre, ventaFabrica);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMasVendedora = new Fabricante();
        Integer fabricaVentas = 0;
        for (Map.Entry<String, VentaFabrica> entry : fabricaVendedora.entrySet()){
            VentaFabrica ventaFabricaEntry = entry.getValue();
            if(ventaFabricaEntry.getTotalVehiculosFabrica() >= fabricaVentas){
                fabricaMasVendedora = ventaFabricaEntry.getFabricante();
                fabricaVentas = ventaFabricaEntry.getTotalVehiculosFabrica();
            }
        }
        return fabricaMasVendedora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
