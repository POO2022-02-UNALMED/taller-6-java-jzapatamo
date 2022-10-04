package vehiculos;

public class Vehiculo {
    private static Integer cantidadVehiculos = 0;

    private String placa;
    private Integer puertas;
    private Integer velocidadMaxima;
    private String nombre;
    private Integer precio;
    private Integer peso;
    private String traccion;
    private Fabricante fabricante;

    public Vehiculo(String placa, Integer puertas, Integer velocidadMaxima, String nombre, Integer precio, Integer peso, String traccion, Fabricante fabricante){
        Vehiculo.cantidadVehiculos++;
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
    }

    public String vehiculosPorTipo() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Automoviles: %s\n", Automovil.getTotalAutomoviles()));
        builder.append(String.format("Camionetas: %s\n", Camioneta.getTotalCamionetas()));
        builder.append(String.format("Camiones: %s", Camion.getTotalCamiones()));
        return builder.toString();
    }


    public static Integer getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public static void setCantidadVehiculos(Integer cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
