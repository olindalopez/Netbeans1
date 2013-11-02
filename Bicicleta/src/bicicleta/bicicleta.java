package bicicleta;

public class bicicleta {

    private int velocidadActual;
    private int velocidadMaxima;
    private int engranajeActual;
    private String nroAro;
    private String marca;
    private String modelo;

    public void cambiarLlantas() {
        System.out.println("Cambiando llantas");
    }

    public void frenar() {
        System.out.println("Frenando");
    }

    public void cambiarVelocidad(int engranajeActual) {
        this.engranajeActual = engranajeActual;
        System.out.println("Cambiando velocidad a " + engranajeActual);
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setEngranajeActual(int engranajeActual) {
        this.engranajeActual = engranajeActual;
    }

    public void setNroAro(String nroAro) {
        this.nroAro = nroAro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getEngranajeActual() {
        return engranajeActual;
    }

    public String getNroAro() {
        return nroAro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
}
