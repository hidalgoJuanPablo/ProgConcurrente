package Punto4;

public class Vehiculo {
    
    private String patente;
    private String modelo;
    private String marca;
    private int kmFaltantesParaElService;
    
    public Vehiculo(String unPatente){
        this.patente=unPatente;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getKmFaltantesParaElService() {
        return kmFaltantesParaElService;
    }
}
