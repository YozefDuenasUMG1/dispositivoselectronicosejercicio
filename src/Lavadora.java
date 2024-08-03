public class Lavadora extends Electrodomestico {
    private int velocidadCentrifugado;

    public Lavadora(String marca, String modelo, int potencia, String color, double capacidadLitros, int velocidadCentrifugado) {
        super(marca, modelo, potencia, color, capacidadLitros);
        this.velocidadCentrifugado = velocidadCentrifugado;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo lavadora " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando lavadora " + marca + " " + modelo);
    }

    @Override
    void realizarTarea() {
        System.out.println("Lavadora lavando ropa");
    }
}