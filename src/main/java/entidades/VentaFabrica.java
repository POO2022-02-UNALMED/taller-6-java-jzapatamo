package entidades;

import vehiculos.Fabricante;

public class VentaFabrica {
    private Fabricante fabricante;
    private Integer totalVehiculosFabrica;

    public VentaFabrica(Fabricante fabricante, Integer totalVehiculosFabrica){
        this.fabricante = fabricante;
        this.totalVehiculosFabrica = totalVehiculosFabrica;
    }

    public void incrementarVehiculoVendidoFabrica(){
        this.totalVehiculosFabrica++;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getTotalVehiculosFabrica() {
        return totalVehiculosFabrica;
    }

    public void setTotalVehiculosFabrica(Integer totalVehiculosFabrica) {
        this.totalVehiculosFabrica = totalVehiculosFabrica;
    }
}
