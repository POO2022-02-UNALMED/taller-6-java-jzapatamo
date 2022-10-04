package vehiculos;

public class Camion extends Vehiculo{

    private static final Integer puertas = 2;
    private static final Integer velocidadMaxima = 80;
    private static final String traccion = "4X2";

    private static Integer totalCamiones = 0;

    private Integer ejes;

    public Camion(String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer ejes) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.ejes = ejes;
        fabricante.getPais().vehiculoVendido();
        fabricante.vehiculoVendidoFabrica();
        Camion.totalCamiones++;
    }

    public Integer getEjes() {
        return ejes;
    }

    public static Integer getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(Integer totalCamiones) {
        Camion.totalCamiones = totalCamiones;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }
}
