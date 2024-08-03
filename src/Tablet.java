public class Tablet extends DispositivoMovil {
    private boolean tieneStylus;

    public Tablet(String marca, String modelo, int potencia, String sistemaOperativo, double tamanioPantalla, boolean tieneStylus) {
        super(marca, modelo, potencia, sistemaOperativo, tamanioPantalla);
        this.tieneStylus = tieneStylus;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo tablet " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando tablet " + marca + " " + modelo);
    }

    @Override
    void iniciar() {
        System.out.println("iniciando tablet " + marca + " " + modelo);
    }
}