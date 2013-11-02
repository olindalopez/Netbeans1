package bicicleta;

public class appblicleta {

    public static void main(String[] args) {
        bicicleta bici = new bicicleta();
        bici.setMarca("CARRERA");
        bici.setModelo("montana");

        bici.cambiarLlantas();
        System.out.println(bici.getMarca());
    }
}
