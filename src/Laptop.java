public class Laptop extends Computadora {
    private double tipo;

    public Laptop(String marca, String modelo, int potencia, String sistemaOperativo, int ram, double pesoKg) {
        super(marca, modelo, potencia, sistemaOperativo, ram);
        this.tipo = tipo;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo laptop " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando laptop " + marca + " " + modelo);
    }

    @Override
    void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando " + programa + " en la laptop");
    }
}