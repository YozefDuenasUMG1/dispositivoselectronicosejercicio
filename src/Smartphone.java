public class Smartphone extends DispositivoMovil {
    private int numeroTelefonico;

    public Smartphone(String marca, String modelo, int potencia, String sistemaOperativo, double tamanioPantalla, int numeroTelefonico) {
        super(marca, modelo, potencia, sistemaOperativo, tamanioPantalla);
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo smartphone " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando smartphone " + marca + " " + modelo);
    }

    @Override
    void iniciar() {
        System.out.println("Conectando smartphone a internet");
    }
}