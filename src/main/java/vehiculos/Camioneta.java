package vehiculos;

public class Camioneta extends Vehiculo{
    private static final Integer velocidadMaxima = 90;
    private static final String traccion = "4X4";

    private static Integer totalCamionetas = 0;


    private Boolean volco;

    public Camioneta(String placa, Integer puertas, String nombre, Integer precio, Integer peso, Fabricante fabricante, Boolean volco){
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco = volco;
        fabricante.getPais().vehiculoVendido();
        fabricante.vehiculoVendidoFabrica();
        Camioneta.totalCamionetas++;
    }

    public Boolean isVolco() {
        return volco;
    }

    public static Integer getTotalCamionetas() {
        return totalCamionetas;
    }

    public static void setTotalCamionetas(Integer totalCamionetas) {
        Camioneta.totalCamionetas = totalCamionetas;
    }

    public void setVolco(Boolean volco) {
        this.volco = volco;
    }
}
