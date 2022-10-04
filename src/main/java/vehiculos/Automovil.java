package vehiculos;

public class Automovil extends Vehiculo{

    private static final Integer puertas = 4;
    private static final Integer velocidadMaxima = 100;
    private static final String traccion = "FWD";
    private static Integer totalAutomoviles = 0;

    private Integer puestos;

    public Automovil(String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer puestos){
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.puestos = puestos;
        fabricante.getPais().vehiculoVendido();
        fabricante.vehiculoVendidoFabrica();
        Automovil.totalAutomoviles++;
    }

    public Integer getPuestos() {
        return puestos;
    }

    public static Integer getTotalAutomoviles() {
        return totalAutomoviles;
    }

    public static void setTotalAutomoviles(Integer totalAutomoviles) {
        Automovil.totalAutomoviles = totalAutomoviles;
    }

    public void setPuestos(Integer puestos) {
        this.puestos = puestos;
    }
}
