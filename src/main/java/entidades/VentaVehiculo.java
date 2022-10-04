package entidades;

import vehiculos.Pais;

public class VentaVehiculo {
    private Pais pais;
    private Integer totalVehiculos;

    public VentaVehiculo(Pais pais, Integer totalVehiculos){
        this.pais = pais;
        this.totalVehiculos = totalVehiculos;
    }

    public void incrementarVehiculosVendidos(){
        this.totalVehiculos++;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombrePais(Pais pais) {
        this.pais = pais;
    }

    public Integer getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(Integer totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }
}
