package vehiculos;

import entidades.VentaVehiculo;

import java.util.HashMap;
import java.util.Map;

public class Pais {

    private static final Map<String, VentaVehiculo>  paisesVendedores = new HashMap<>();

    private String nombre;

    public Pais() {}

    public Pais(String nombre){
        this.nombre = nombre;
        this.crearPais();
    }

    private void crearPais(){
       Boolean existePais =  paisesVendedores.containsKey(this.nombre);
       if(!existePais){
           VentaVehiculo ventaVehiculo = new VentaVehiculo(this, 0);
           paisesVendedores.put(this.nombre, ventaVehiculo);
       }
    }

    public void vehiculoVendido(){
        VentaVehiculo ventaVehiculo = paisesVendedores.get(this.nombre);
        ventaVehiculo.incrementarVehiculosVendidos();
        paisesVendedores.put(this.nombre, ventaVehiculo);
    }

    public static Pais paisMasVendedor(){
        Pais paisMasVendedor = new Pais();
        Integer paisVentas = 0;
        for (Map.Entry<String, VentaVehiculo> entry : paisesVendedores.entrySet()){
            VentaVehiculo ventaVehiculoEntry = entry.getValue();
            if(ventaVehiculoEntry.getTotalVehiculos() >= paisVentas){
                paisMasVendedor = ventaVehiculoEntry.getPais();
                paisVentas = ventaVehiculoEntry.getTotalVehiculos();
            }
        }
        return paisMasVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
