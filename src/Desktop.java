public class Desktop extends Computadora {
    private String tipoGabinete;

    public Desktop(String marca, String modelo, int potencia, String sistemaOperativo, int ram, String tipoGabinete) {
        super(marca, modelo, potencia, sistemaOperativo, ram);
        this.tipoGabinete = tipoGabinete;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo desktop " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando desktop " + marca + " " + modelo);
    }

    @Override
    void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando " + programa + " en el desktop");
    }
}